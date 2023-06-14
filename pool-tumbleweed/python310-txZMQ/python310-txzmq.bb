SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python310-txZMQ-1.0.0-1.3.noarch.rpm"
RPM_HASH = "d52306a0a84c955d24efbdd4db7259bf70ca6eeede69c0a10dcc6c157849c182d61782bfe34e10756c7a732ec8284e9b18029e9b48a943b33bb4d6c050907c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txZMQ \
python3.10dist-txzmq \
python310-txZMQ \
python3dist-txzmq"

RDEPENDS:${PN} += "python-abi \
python310-Twisted \
python310-pyzmq"

inherit rpm
