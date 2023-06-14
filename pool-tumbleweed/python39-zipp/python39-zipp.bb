SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "3.15.0"

RPM_NAME = "python39-zipp-3.15.0-2.1.noarch.rpm"
RPM_HASH = "0edc176ccf46621435c97fef3d38f2fa817509051ecb0fcee04163d3a1e5a0cb5de45c419f6089226d86d4163bfa87ece51b1fba30fe2338ffc964f279c73e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zipp \
python39-zipp \
python3dist-zipp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
