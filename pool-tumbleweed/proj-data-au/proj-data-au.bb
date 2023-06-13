SUMMARY = "Australia datum grids for Proj"
DESCRIPTION = "Australia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-au-9.2.0-1.3.noarch.rpm"
RPM_HASH = "4c5d92610c54721b80c25daaf9fa05f9aba60613cae1a51012d8f5f90c9ec05882ef70b547981c51f1d377fdd8f3d59e3629caf19e052421d446011e6cde9711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-au"

RDEPENDS:${PN} += ""

inherit rpm
