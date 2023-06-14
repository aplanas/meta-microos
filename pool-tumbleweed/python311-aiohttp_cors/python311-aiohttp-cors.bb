SUMMARY = "Asynchronous HTTP client/server framework"
DESCRIPTION = "Asynchronous HTTP client/server framework for Python. \
 \
- Supports both the client and server side of HTTP protocol. \
- Supports both client and server WebSockets out-of-the-box. \
- Web-server has middleware and pluggable routing."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "python311-aiohttp_cors-0.7.0-5.1.noarch.rpm"
RPM_HASH = "28d4519a159c5f8cbe77a13f9279a2eb4db7fa546701a3eed262d8d11718cf166536cec25dcbeb7c7abd7759a80ba5b18791291e86757f429e5214dcb7306082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiohttp-cors \
python311-aiohttp-cors \
python3dist-aiohttp-cors"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-async-timeout \
python311-chardet \
python311-multidict \
python311-yarl"

inherit rpm
