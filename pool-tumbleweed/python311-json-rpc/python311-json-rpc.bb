SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-json-rpc-1.14.0-1.3.noarch.rpm"
RPM_HASH = "53c6cd1ce5f687ba62dc5ca6f606a604b7d27c38cc22962ad1149dc3a4500c2f6ee8bc63ec10739b00b6420a6d52cc052a5e173f50d6538b2262e00bd36f0dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(json-rpc) \
python311-json-rpc \
python3dist(json-rpc)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
