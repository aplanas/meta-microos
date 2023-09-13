SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.5"

RPM_NAME = "python39-aiohttp-3.8.5-2.1.aarch64.rpm"
RPM_HASH = "4f6b94457ee38f772d567d50e3873cb59b104181dda6c47d6755c9b2be7c310a70b342cbc890e9905227dbb6cfd6ac0b81f1cfa66d6ef781e7656ed3841606c0"

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
