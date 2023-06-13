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

RPM_NAME = "python311-websockets-11.0.3-2.1.aarch64.rpm"
RPM_HASH = "0d9552225afecf94484341561b14f3b8fa4946788dff9d53e0b80cd8b0a122b999139d3e4a437f9a107f0cd5852965c7900e4deb0c1eeec91880fbe37cfc8443"

RPROVIDES:${PN} += "python3.11dist(websockets) \
python311-websockets \
python311-websockets(aarch-64) \
python3dist(websockets)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
