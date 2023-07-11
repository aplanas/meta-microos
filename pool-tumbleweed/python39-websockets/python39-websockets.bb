SUMMARY = "An implementation of the WebSocket Protocol (RFC 6455)"
DESCRIPTION = "WebSockets is a library for developing WebSocket servers_ and clients_ in \
Python. It implements RFC 6455 with a focus on correctness and simplicity. \
It passes the Autobahn Testsuite. \
 \
Built on top of Python's asynchronous I/O support introduced in PEP 3156, \
it provides an API based on coroutines, making it easy to write highly \
concurrent applications."
LICENSE = "BSD-3-Clause"

PV = "11.0.3"

RPM_NAME = "python39-websockets-11.0.3-2.3.aarch64.rpm"
RPM_HASH = "146258c30ff7222c9602b3dafec64805f9cb91a4d9541a19b2a5f1bb98435d011831b32ee4316577c8a35d48c5c2ba5c5c8ae0f641040d8270e4e5725d3560c4"

RPROVIDES:${PN} += "python3.9dist-websockets \
python39-websockets \
python3dist-websockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
