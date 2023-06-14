SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-json-rpc-1.14.0-1.3.noarch.rpm"
RPM_HASH = "28200edf084ae8e6d9c75a0e3eb6d5c00d6a1700a618195b9e5cbcd957e30f175db112796d79af63a81d97d47f862638402d17568fd4a072436dbd3dd4ef0704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-json-rpc \
python3.10dist-json-rpc \
python310-json-rpc \
python3dist-json-rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
