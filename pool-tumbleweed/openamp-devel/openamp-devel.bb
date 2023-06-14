SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "openamp-devel-2020.01-1.12.aarch64.rpm"
RPM_HASH = "3de4657d757927a4a43184f1b29afe6cd5deda2c26a24f6e522f97f86e100177716d8cb65d9e989ec9b0612f3eefb11873bf07879354a2b1d4a982974aa16343"

RPROVIDES:${PN} += "openamp-devel"

RDEPENDS:${PN} += "libopen-amp0"

inherit rpm
