SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python39-txZMQ-1.0.0-1.4.noarch.rpm"
RPM_HASH = "c49da17ff4c018020ac522deb33ffdf4e31639897eacf480189dfea1f769fbf0dee1d99ee42b9cd7204ce546c779e7db5eb39018151ac527a83ec3be45cd4e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-txzmq \
python39-txZMQ \
python3dist-txzmq"

RDEPENDS:${PN} += "python-abi \
python39-Twisted \
python39-pyzmq"

inherit rpm
