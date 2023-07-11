SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "python310-sphinx-tabs-3.4.1-2.3.noarch.rpm"
RPM_HASH = "f492c000a06c74d604a62a5d7fe3140ff720164284c93cb06820d94cd0747ef20cf01aaafd4a46f283fc79a7fc75bf46a1ee360cb6d982f8efd29dcb491d3847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-tabs \
python310-sphinx-tabs \
python3dist-sphinx-tabs"

RDEPENDS:${PN} += "python-abi \
python310-Pygments \
python310-Sphinx \
python310-docutils"

inherit rpm
