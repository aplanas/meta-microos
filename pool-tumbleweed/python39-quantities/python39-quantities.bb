SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python39-quantities-0.14.1-1.1.noarch.rpm"
RPM_HASH = "e7668067094962817acffbb7e4126b7516edd3d559eaa584aed1420ef0c8edc38420255419b89fcb1014f4509925ae872626fb28c33a7c255660a4303b675476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(quantities) \
python39-quantities \
python3dist(quantities)"

RDEPENDS:${PN} += "python(abi) \
python39-numpy"

inherit rpm
