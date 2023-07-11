SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-pname-1.0.2-1.14.noarch.rpm"
RPM_HASH = "a7c1af27b35b9a26ce6da7bbe7b8e68491689b26116ab86d51554ac259ed718fdd5883935d0dd0554c32d337d9de3bd0d2d3e01fb93dd06307fb0273331c7bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pname \
python3.11dist-pname \
python311-pname \
python3dist-pname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
