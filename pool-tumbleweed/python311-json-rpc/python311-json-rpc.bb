SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-json-rpc-1.14.0-1.5.noarch.rpm"
RPM_HASH = "9d5f4570982ab07110d8ed34ece32e52ae0ff2fedb7bf1f28abb95d89b98757d4cffd3d5d3376dec914ca965e94292bf879f260aa8800117b2f42f4a6a0e21f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json-rpc \
python3.11dist-json-rpc \
python311-json-rpc \
python3dist-json-rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
