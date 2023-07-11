SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python311-txZMQ-1.0.0-1.4.noarch.rpm"
RPM_HASH = "ae0fd4c55aa9258fc1ced660cc86ee407c101cdfbd4c950477efa83fde8b769ebe8122ccee8fa09903767ea3bf238be6f80b366faddb59c4eb2b2928d87aa232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txZMQ \
python3.11dist-txzmq \
python311-txZMQ \
python3dist-txzmq"

RDEPENDS:${PN} += "python-abi \
python311-Twisted \
python311-pyzmq"

inherit rpm
