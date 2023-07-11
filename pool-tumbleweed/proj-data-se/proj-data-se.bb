SUMMARY = "Sweden datum grids for Proj"
DESCRIPTION = "Sweden datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-se-9.2.1-1.1.noarch.rpm"
RPM_HASH = "ef62df4290e23420eced23b73634a484fb2a058465a3d605448d07a82f568b8d977bad52ea31b2c56b9a5a53cd5bc928802094bac752a5574f223959da2a5833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-se"

RDEPENDS:${PN} += ""

inherit rpm
