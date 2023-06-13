SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pydata-sphinx-theme-0.13.1-2.1.noarch.rpm"
RPM_HASH = "9c9145b802b9aadecbbc23832d7ff1ecd6cee34480ee97879e3aa0b0b7ae4027aeb5946e29b70d0257b2ae5fc66314ed9e4ee2b2875e2cc2c248ae96e16fe59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydata-sphinx-theme \
python3.10dist(pydata-sphinx-theme) \
python310-pydata-sphinx-theme \
python3dist(pydata-sphinx-theme)"

RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-beautifulsoup4 \
python310-docutils \
python310-sphinx-theme-builder"

inherit rpm
