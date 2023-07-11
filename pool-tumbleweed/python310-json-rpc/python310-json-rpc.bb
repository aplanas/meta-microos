SUMMARY = "JSON-RPC transport implementation"
DESCRIPTION = "JSON-RPC 2.0 and JSON-RPC 1.0 transport specification implementation. \
 \
This implementation does not have any transport functionality \
realization, only protocol. Any client or server implementation is \
easy based on current code, but requires transport libraries, such as \
requests, gevent or zmq."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-json-rpc-1.14.0-1.5.noarch.rpm"
RPM_HASH = "22795c5c8eaed1a10e8f6366786c447bb748d95620e0a03ba15e06380555730020c5bbd2f2207c8cfdb7d0e0d0c49a2e4bc29a26667d97b07e1a20815951a076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-json-rpc \
python310-json-rpc \
python3dist-json-rpc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
