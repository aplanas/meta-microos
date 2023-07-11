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

RPM_NAME = "python310-websockets-11.0.3-2.3.aarch64.rpm"
RPM_HASH = "80dcaf15110b7cf8cb9322d7e001d1ff91a7f6b144cfb59b8d5f08ace40512943481cc7d16e7bc43f567ee58638d6100091000c8f110e17c206f1c35a8730c3b"

RPROVIDES:${PN} += "python3.10dist-websockets \
python310-websockets \
python3dist-websockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
