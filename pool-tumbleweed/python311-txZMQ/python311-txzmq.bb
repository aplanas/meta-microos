SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python311-txZMQ-1.0.0-1.3.noarch.rpm"
RPM_HASH = "8823bbf1037a8d3b509b0c068b6ca1e458c9c20672423203eb2c4bbabd047b7928babfeebaced43139c36cd5b78b3bc6cbccb8a2a43f3e7235b21252d4863882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(txzmq) \
python311-txZMQ \
python3dist(txzmq)"

RDEPENDS:${PN} += "python(abi) \
python311-Twisted \
python311-pyzmq"

inherit rpm
