SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python311-sphinxcontrib-autoprogram-doc-0.1.8-2.3.noarch.rpm"
RPM_HASH = "01edf42312213fb4bd6b3774adb2fffd0d39ceb12da0881c754e8f82978944a2e84587b9a92e01933d844fcf15c573c0be0fda964ed04365c5df97e71dbb14dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-autoprogram-doc \
python311-sphinxcontrib-autoprogram-doc"

RDEPENDS:${PN} += "python311-Sphinx"

inherit rpm
