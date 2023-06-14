SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "3.8.4"

RPM_NAME = "python311-aiohttp-3.8.4-1.1.aarch64.rpm"
RPM_HASH = "3d93e61b7a485d104907daf7219a4336d42ee0ed0906b1b283795aca8bb610fb4602dd83d737ed3c6043ab67546f1b353fa60f72f17b9cd7e7ac31c3b63955a8"

RPROVIDES:${PN} += "python3.11dist-aiohttp \
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
