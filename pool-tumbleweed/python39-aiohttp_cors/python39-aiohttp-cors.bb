SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python39-aiohttp_cors-0.7.0-5.2.noarch.rpm"
RPM_HASH = "5a1c97702f51a33793b702c3d1ecd8a83b7748a72f0441a09c8d3383705cd9f9242a65a9bf596fe6721c8654def3edad0c240b82c2b3eb0cb25bceb905a4dfca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiohttp-cors \
python39-aiohttp-cors \
python3dist-aiohttp-cors"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-async-timeout \
python39-chardet \
python39-multidict \
python39-yarl"

inherit rpm
