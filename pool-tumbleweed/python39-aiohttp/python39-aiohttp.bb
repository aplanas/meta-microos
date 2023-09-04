SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.5"

RPM_NAME = "python39-aiohttp-3.8.5-1.1.aarch64.rpm"
RPM_HASH = "e8e15688929715912f83043cd235c3573a0a4a19101ff28ea8bef0d9dbb5ad81b36b7796d6344424289b9a2068d702de6e23eb68489439c10d7c79f5023a8ae9"

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
