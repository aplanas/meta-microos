SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python311-sphinx-feature-classification-1.1.0-2.10.noarch.rpm"
RPM_HASH = "c2a8ec8fb89bb2470b000f1dd9c97c8740ec7e83d54df4666a3eb55988e7f56c1ee80c1dc94155a346f0ba232725ea4dabd47900f7ee80edd1c2424afa93a089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-feature-classification) \
python311-sphinx-feature-classification \
python3dist(sphinx-feature-classification)"

RDEPENDS:${PN} += "python(abi) \
python311-docutils \
python311-pbr"

inherit rpm
