SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python310-aiohttp-jinja2-1.5.1-2.1.noarch.rpm"
RPM_HASH = "7929c4d10feb85c6f2f8efcbf47e1102a1bd19239b0927ffec8950b9846a8d2286e8010fde5eb8bc3edd912958ac330500b5c00da06badf8617f9137590b4d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiohttp-jinja2 \
python310-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-aiohttp"

inherit rpm
