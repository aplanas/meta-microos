SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.5"

RPM_NAME = "python310-aiohttp-3.8.5-1.1.aarch64.rpm"
RPM_HASH = "5b2ceb7eb2ba5496c4b945df42ba122c61af7303cf0197bfac504d35b7eb9a1c507353e030d7c04f20c5b2889f6a160e07f4d2deb4d6c9efd8101c7089e32d39"

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
