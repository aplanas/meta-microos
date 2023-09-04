SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.5"

RPM_NAME = "python311-aiohttp-3.8.5-1.1.aarch64.rpm"
RPM_HASH = "58c9383695b23de1c6637c3d83f07e8bd32f3175c4f64dce6e43f9fce9c11008e828d5b0b556980724e95a4b58fd80d8955cb3d5f30eb0f9b1f4ed7e80e88855"

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
