SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-branca-0.6.0-2.4.noarch.rpm"
RPM_HASH = "3d64a7d552590196677e0742906bc8bc2d9108bfe14b842e9b85d3b5b0a654bf4b9082db94d42ecd8bba40f163b405c6d101f910eb2339546cde2950dc481e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-branca \
python310-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2"

inherit rpm
