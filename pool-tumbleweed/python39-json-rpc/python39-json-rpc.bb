SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python39-json-rpc-1.14.0-1.5.noarch.rpm"
RPM_HASH = "ccafc9645f64cd3f797d041d149e3bef335dae945175c42b379faae01d4edebb2ad7a230b74460ffdc6e8a3fdfdf8e333fdddf0efe69ffedd0905b5f48ab5693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-json-rpc \
python39-json-rpc \
python3dist-json-rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
