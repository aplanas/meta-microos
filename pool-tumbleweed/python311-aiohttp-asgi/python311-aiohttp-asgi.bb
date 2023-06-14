SUMMARY = "Adapter to running ASGI applications on aiohttp"
DESCRIPTION = "Adapter to running ASGI applications on aiohttp."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python311-aiohttp-asgi-0.5.2-1.1.noarch.rpm"
RPM_HASH = "1a28109f5d9398a670b7bd65c1f6053c7e3b0ac8fef180baf2d6cface7d7c941dc5d1ce3a39f0a4dd92784e596cdaa0bb97074830dd5df0bcdea50d523666e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiohttp-asgi \
python311-aiohttp-asgi \
python3dist-aiohttp-asgi"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-aiohttp"

inherit rpm
