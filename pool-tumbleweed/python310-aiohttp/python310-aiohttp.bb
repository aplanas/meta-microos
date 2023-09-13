SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.5"

RPM_NAME = "python310-aiohttp-3.8.5-2.1.aarch64.rpm"
RPM_HASH = "0d42918802c260c3f1451482376d15c6f0784c97489b2b9f82772e0f67e72285d1297adef345897ba4d99837bc94e3fc1805e4ebde3765d07342d10fcfd7ae8e"

RPROVIDES:${PN} += "python3.10dist-aiohttp \
python310-aiohttp \
python3dist-aiohttp"

RDEPENDS:${PN} += "-python310-async-timeout >= 4.0 with python310-async-timeout < 5 \
-python310-charset-normalizer >= 2.0 with python310-charset-normalizer < 4 \
-python310-multidict >= 4.5 with python310-multidict < 7 \
-python310-yarl >= 1.0 with python310-yarl < 2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-aiosignal \
python310-attrs \
python310-frozenlist"

inherit rpm
