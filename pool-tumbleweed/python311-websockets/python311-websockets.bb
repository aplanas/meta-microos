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

RPM_NAME = "python311-websockets-11.0.3-2.3.aarch64.rpm"
RPM_HASH = "427efcca94681f177d664c8d85e38d6236dc17deff5a47d1c1a31efba9f878ca44b6a13dc7af9234eeea83e716a3affd18f380c6b5bd86511461e41a3c2ef0ba"

RPROVIDES:${PN} += "python3-websockets \
python3.11dist-websockets \
python311-websockets \
python3dist-websockets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
