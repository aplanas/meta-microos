SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python310-sphinx-feature-classification-1.1.0-2.10.noarch.rpm"
RPM_HASH = "f5b33e2dede6a5164ee4efaddf8128a755c416e3b09e851aac67a2ed00079ceec314b3dcf1b06c5bdbe75a4fad67724ee6b9f1fa13c203364b0068bd84c4c1f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-feature-classification \
python3.10dist-sphinx-feature-classification \
python310-sphinx-feature-classification \
python3dist-sphinx-feature-classification"

RDEPENDS:${PN} += "python-abi \
python310-docutils \
python310-pbr"

inherit rpm
