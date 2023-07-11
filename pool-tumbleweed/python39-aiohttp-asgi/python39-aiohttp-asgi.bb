SUMMARY = "Adapter to running ASGI applications on aiohttp"
DESCRIPTION = "Adapter to running ASGI applications on aiohttp."
LICENSE = "Apache-2.0"

PV = "0.5.2"

RPM_NAME = "python39-aiohttp-asgi-0.5.2-1.3.noarch.rpm"
RPM_HASH = "d8bbbe35263d02aef4aaab34e4369a2bcdea55954984bc5a188ccd9e1d6ff6bfcddf3c2aa21039eab2d8943dc6313fd576c52899d0e87d398e7a08df56bfc703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiohttp-asgi \
python39-aiohttp-asgi \
python3dist-aiohttp-asgi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiohttp"

inherit rpm
