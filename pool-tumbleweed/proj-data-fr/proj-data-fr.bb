SUMMARY = "France datum grids for Proj"
DESCRIPTION = "France datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-fr-9.2.0-1.3.noarch.rpm"
RPM_HASH = "4bc76061194f5a0e9ca05e7c1525a27f5f4f70c542f21231cba857d210e4139239b5f59ad37690fff5bb5c035cf8d7d67b5cc3b0b76c688d2a3abea1097cfed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fr"

RDEPENDS:${PN} += ""

inherit rpm
