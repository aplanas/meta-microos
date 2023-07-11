SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.4"

RPM_NAME = "python311-aiohttp-3.8.4-1.3.aarch64.rpm"
RPM_HASH = "e6e6781566d770659b2b55bc11e2937b03ec6bcb7ca36f72f87810286a6f4a24e693b14755a9a4e2eac48b5cd9e026ee36cb8cd3a01eaa5e61583216c935ea5f"

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
