SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python311-sphinx-feature-classification-1.1.0-3.1.noarch.rpm"
RPM_HASH = "988882b5b42a7b6c5ba19e8fdb4a5aa176e8ef5d9a24ceb97c60f7254d965431befb7ca72e08e1cd0219410c1f502da4d90b56b1bd806394247e276bf3702d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-feature-classification \
python3.11dist-sphinx-feature-classification \
python311-sphinx-feature-classification \
python3dist-sphinx-feature-classification"

RDEPENDS:${PN} += "python-abi \
python311-docutils \
python311-pbr"

inherit rpm
