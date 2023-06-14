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

RPM_NAME = "python310-websockets-11.0.3-2.1.aarch64.rpm"
RPM_HASH = "3dec5f66275fc9fe0d247715381ac4b22f8560f71a87456e364375d5d3a9529a279351dff4db06a6cc7d8d635cca55c788783ccbe15a5cb773d03f227e803178"

RPROVIDES:${PN} += "python3-websockets \
python3.10dist-websockets \
python310-websockets \
python3dist-websockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
