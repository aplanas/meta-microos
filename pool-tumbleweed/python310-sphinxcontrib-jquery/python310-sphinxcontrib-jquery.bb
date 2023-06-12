SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python310-sphinxcontrib-jquery-4.1-1.1.noarch.rpm"
RPM_HASH = "138e14dd5c2e75845705c73c56b64c6fdddd6d720b016e66afd39238d2508195923a8483cdf1f45f8db5991ccee5e49caf418f8b5cb2f5073161b4addad693bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jquery \
python3.10dist(sphinxcontrib-jquery) \
python310-sphinxcontrib-jquery \
python3dist(sphinxcontrib-jquery)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
