SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python310-sphinx-feature-classification-1.1.0-3.1.noarch.rpm"
RPM_HASH = "1ad4ab00b6cbe1a9e7c239aba0ddfc29c2ca24a868799cfdcb3edda24c720b452d733a2f145ac819c21a725c8aa50973b6a063ce9fce5f69b237d72c87c6f2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-feature-classification \
python310-sphinx-feature-classification \
python3dist-sphinx-feature-classification"

RDEPENDS:${PN} += "python-abi \
python310-docutils \
python310-pbr"

inherit rpm
