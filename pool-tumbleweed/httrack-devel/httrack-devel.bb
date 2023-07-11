SUMMARY = "Development files for httrack"
DESCRIPTION = "This package contains the header and library files for httrack."
LICENSE = "GPL-3.0-or-later"

PV = "3.49.2"

RPM_NAME = "httrack-devel-3.49.2-2.9.aarch64.rpm"
RPM_HASH = "7ca5723c40d154295224361a7103cd2dc82e15f9011a7a2b0de9dae6b0effa78cebbb3db74f43b3aa1f04af38ddff9a019249f7446fcb7ea6ac061ab073a7bcf"

RPROVIDES:${PN} += "httrack-devel"

RDEPENDS:${PN} += "libhttrack2 \
libopenssl-devel"

inherit rpm
