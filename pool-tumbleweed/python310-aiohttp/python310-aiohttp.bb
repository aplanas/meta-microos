SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.4"

RPM_NAME = "python310-aiohttp-3.8.4-1.1.aarch64.rpm"
RPM_HASH = "fa90460562cd83a443fb3939c0a41d1a8d19051ded2b4f080b2d2992695092539cdb5697ed5669ae61bd52eec401b84cc6328105586f88ea2d1ce61279ca1e91"

RPROVIDES:${PN} += "python3-aiohttp \
python3.10dist-aiohttp \
python310-aiohttp \
python3dist-aiohttp"

RDEPENDS:${PN} += "-python310-async-timeout >= 4.0 with python310-async-timeout < 5 \
-python310-asynctest = 0.13.0 if python310-base < 3.8 \
-python310-charset-normalizer >= 2.0 with python310-charset-normalizer < 4 \
-python310-idna-ssl >= 1.0 if python310-base < 3.7 \
-python310-multidict >= 4.5 with python310-multidict < 7 \
-python310-typing-extensions >= 3.7.4 if python310-base < 3.8 \
-python310-yarl >= 1.0 with python310-yarl < 2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-aiosignal \
python310-attrs \
python310-frozenlist"

inherit rpm
