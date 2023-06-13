SUMMARY = "Run time data for hwloc"
DESCRIPTION = "This package contains the run time data for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-data-2.9.0-3.1.noarch.rpm"
RPM_HASH = "f56b9234b3152ed470fa44b9770b5bfcbe3414f225bdabdb229bcb4c71f2bd253fe6ae401a294d2f31f4cfccdfd6d85557adddc52d78c195a2d9ad103d79badc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-data"

RDEPENDS:${PN} += ""

inherit rpm
