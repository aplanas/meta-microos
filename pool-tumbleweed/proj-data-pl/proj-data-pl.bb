SUMMARY = "Poland datum grids for Proj"
DESCRIPTION = "Poland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-pl-9.2.1-1.1.noarch.rpm"
RPM_HASH = "c48bb5b1ea075757f0cdec6ca85a108633971914737168e9f00136ed4ad0c3710a0ae65599c81ceb07a4bdf3d65514d3b747a407c2f0c9a7c4d8f04d3366d75d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-pl"

RDEPENDS:${PN} += ""

inherit rpm
