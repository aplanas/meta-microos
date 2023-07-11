SUMMARY = "Austria datum grids for Proj"
DESCRIPTION = "Austria datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-at-9.2.1-1.1.noarch.rpm"
RPM_HASH = "edf35019c71e5142b1430f0b29fc6ae37be8b0f458bef4d5567f8600b86d86d3f8e3324bdfd52c44d7a89fc6b90609a187e05e651a39a70cee9659f9c3b888c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-at"

RDEPENDS:${PN} += ""

inherit rpm
