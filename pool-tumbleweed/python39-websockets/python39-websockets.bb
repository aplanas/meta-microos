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

RPM_NAME = "python39-websockets-11.0.3-2.1.aarch64.rpm"
RPM_HASH = "1dc34ab313b32aed81a90ba1e8750dcc2668c322585c655276c64e0b96eb9bc1f88a7efd4594f8a51b557dfa912300f76dba4b03411af38489a7e1c668f9bf23"

RPROVIDES:${PN} += "python3.9dist(websockets) \
python39-websockets \
python39-websockets(aarch-64) \
python3dist(websockets)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
