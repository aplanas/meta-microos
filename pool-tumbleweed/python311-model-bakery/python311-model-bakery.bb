SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python311-model-bakery-1.9.0-1.3.noarch.rpm"
RPM_HASH = "bb65e9688e40b94487f52ad9964d2bffea2ed4c932609ccb050a54539e886cfd7d82719080b0cebfc98f9a67d45ef0d74a79e4f32f0a2940bfff0104a8c7a509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(model-bakery) \
python311-model-bakery \
python3dist(model-bakery)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
