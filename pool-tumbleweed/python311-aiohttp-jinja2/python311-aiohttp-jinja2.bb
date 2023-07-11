SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python311-aiohttp-jinja2-1.5.1-2.1.noarch.rpm"
RPM_HASH = "6fc7595a8aaf98f0b00b30ba36535e867bd7bed6cc124eedb8e1e1559d490ffdf3716c6aafbbff90cd0e38dc8c82b7e9a462741e7f4cf1c16b92f2519b529a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-jinja2 \
python3.11dist-aiohttp-jinja2 \
python311-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-aiohttp"

inherit rpm
