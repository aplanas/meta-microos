SUMMARY = "Twisted bindings for ZeroMQ"
DESCRIPTION = "txZMQ allows to integrate ZeroMQ sockets into Twisted event loop (reactor). \
It supports both CPython and PyPy, and ZeroMQ library versions 2.2.x or 3.2.x."
LICENSE = "MPL-2.0"

PV = "1.0.0"

RPM_NAME = "python310-txZMQ-1.0.0-1.4.noarch.rpm"
RPM_HASH = "fe53706f182e94c4e48cd1e71433b015fb50da3eab50f35a8f417c491e1f969c849a7571a6023608373ff5f80bd94dbed74c275524832171073047398bf9e61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-txzmq \
python310-txZMQ \
python3dist-txzmq"

RDEPENDS:${PN} += "python-abi \
python310-Twisted \
python310-pyzmq"

inherit rpm
