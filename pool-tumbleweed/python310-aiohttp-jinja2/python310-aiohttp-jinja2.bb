SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python310-aiohttp-jinja2-1.5.1-1.3.noarch.rpm"
RPM_HASH = "4e952343a5e392ba82df8284d2381fcdc9f3ca73a4c343edca1cb92e154b793163b76cc651fd1c4f4ae1a8ce5e6517d7b5d0656da6bad8f0de01ec2d35501289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-jinja2 \
python3.10dist-aiohttp-jinja2 \
python310-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-aiohttp"

inherit rpm
