SUMMARY = "Portugal datum grids for Proj"
DESCRIPTION = "Portugal datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-pt-9.2.1-1.1.noarch.rpm"
RPM_HASH = "21ca5d71f60153fbced527f7cc987da5e3d458db1538843223078f9393256fce959439cb93b73371e0c8aed2ca52636dda1e2287afb8270906f2af5d7cf68662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-pt"

RDEPENDS:${PN} += ""

inherit rpm
