SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python39-aiohttp-jinja2-1.5.1-2.1.noarch.rpm"
RPM_HASH = "7a4619367a4c0653da2a2ee017d787ad8a601b6766dab554c325b5d00a5bfe74297d4bcf1a49ab1975182a78443211ad2bb888f06c7c6df809109ecde325aba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiohttp-jinja2 \
python39-aiohttp-jinja2 \
python3dist-aiohttp-jinja2"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-aiohttp"

inherit rpm
