SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python311-aiohttp-jinja2-1.5.1-1.3.noarch.rpm"
RPM_HASH = "7351dc788ddc1a6b0782becef39cfc32802b68de9ac3f8f139ca93ab4f3dab2b237b1f1c5c3ac3aadb27f86d307cac81abf1e9d85594834e1286e2e029d98e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiohttp-jinja2 \
python311-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-aiohttp"

inherit rpm
