SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.5"

RPM_NAME = "python311-aiohttp-3.8.5-2.1.aarch64.rpm"
RPM_HASH = "1cd756857aaf2ae779901d224ec2b368f1870d293dad754369e4dd8b23be649f07725ed26ec2907598401587b06ede1ff5f2930605c255457ec58d384bfda693"

RPROVIDES:${PN} += "python3-aiohttp \
python3.11dist-aiohttp \
python311-aiohttp \
python3dist-aiohttp"

RDEPENDS:${PN} += "-python311-async-timeout >= 4.0 with python311-async-timeout < 5 \
-python311-charset-normalizer >= 2.0 with python311-charset-normalizer < 4 \
-python311-multidict >= 4.5 with python311-multidict < 7 \
-python311-yarl >= 1.0 with python311-yarl < 2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-aiosignal \
python311-attrs \
python311-frozenlist"

inherit rpm
