SUMMARY = "New Zealand datum grids for Proj"
DESCRIPTION = "New Zealand datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-nz-9.2.1-1.1.noarch.rpm"
RPM_HASH = "5d5b52a17b40820dfca3b5a85f61c75952051ca41dbead674a6934c51b125094ce3a0a0da7c864568b2e836a4ed0d8ae2224186ba6bc95d443efeac130482691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-nz"

RDEPENDS:${PN} += ""

inherit rpm
