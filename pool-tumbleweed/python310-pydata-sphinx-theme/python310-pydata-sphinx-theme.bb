SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python310-pydata-sphinx-theme-0.13.1-2.2.noarch.rpm"
RPM_HASH = "ee0dea4dc3e20fdade0287deee9bd65ce7cb90a13a14c60b7f5cf549513597bb18ac3988d6f31276ffe7619deb4b35ba23725ad13b7c7a52e352de9411570de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pydata-sphinx-theme \
python310-pydata-sphinx-theme \
python3dist-pydata-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-beautifulsoup4 \
python310-docutils \
python310-sphinx-theme-builder"

inherit rpm
