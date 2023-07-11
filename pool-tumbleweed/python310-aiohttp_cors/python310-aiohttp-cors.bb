SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python310-aiohttp_cors-0.7.0-5.2.noarch.rpm"
RPM_HASH = "bf0c28b83db545e35b505dab1fb56fab80fe056b32cef52449c153c3d0376dd64f92aff5d90fe60d0b64d617f79543d8e27a5290f4b9dde3b36db5a29bfc4f3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiohttp-cors \
python310-aiohttp-cors \
python3dist-aiohttp-cors"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-async-timeout \
python310-chardet \
python310-multidict \
python310-yarl"

inherit rpm
