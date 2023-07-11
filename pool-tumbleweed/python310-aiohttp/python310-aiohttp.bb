SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.4"

RPM_NAME = "python310-aiohttp-3.8.4-1.3.aarch64.rpm"
RPM_HASH = "0aa2b3f8656bf586bd193daae918115cc15aa53ef9a8f77688bda45c57459dd87a7fa5e034ccaa08e8830aa4a5a39a2c2dd7f599fb804a6a36a6a21e923a6b75"

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
