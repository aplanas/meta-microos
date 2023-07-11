SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python311-model-bakery-1.9.0-1.5.noarch.rpm"
RPM_HASH = "3a55dd11f951f35cc36eb00595a1c274218e726399328202c3b0d861ff395378cfd5a783e38418a2483e3474875b0602b39eecee3bc09f9240c8774e5708309e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-model-bakery \
python3.11dist-model-bakery \
python311-model-bakery \
python3dist-model-bakery"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
