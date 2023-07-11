SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python311-aiohttp_cors-0.7.0-5.2.noarch.rpm"
RPM_HASH = "3f3ef4146ae7897f5234cbbfa3b6d3bfc2ff06a0e72f1aebb12fe7007d3533549f08adc87691b8d81cb0b050deeebd2526bb1a22d14442c330c6425ca5ce1bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-cors \
python3.11dist-aiohttp-cors \
python311-aiohttp-cors \
python3dist-aiohttp-cors"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-async-timeout \
python311-chardet \
python311-multidict \
python311-yarl"

inherit rpm
