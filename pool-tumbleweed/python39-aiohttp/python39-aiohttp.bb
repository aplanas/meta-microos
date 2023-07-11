SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.4"

RPM_NAME = "python39-aiohttp-3.8.4-1.3.aarch64.rpm"
RPM_HASH = "6a7657d2d723c982c6c46062d670f5910fc100beaae8e708279288605b65fc8e6f0d430c8f3de8c2ce0969a11193d26f6b91b2cd0117d14830e8fe38becac8cd"

RPROVIDES:${PN} += "python3.9dist-aiohttp \
python39-aiohttp \
python3dist-aiohttp"

RDEPENDS:${PN} += "-python39-async-timeout >= 4.0 with python39-async-timeout < 5 \
-python39-charset-normalizer >= 2.0 with python39-charset-normalizer < 4 \
-python39-multidict >= 4.5 with python39-multidict < 7 \
-python39-yarl >= 1.0 with python39-yarl < 2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-aiosignal \
python39-attrs \
python39-frozenlist"

inherit rpm
