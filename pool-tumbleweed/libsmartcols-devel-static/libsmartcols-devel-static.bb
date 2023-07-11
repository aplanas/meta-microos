SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols-devel-static-2.39-1.1.aarch64.rpm"
RPM_HASH = "1d5a2f02aa3f95a0ba7d098dbc93985a047c297a0d6e2635fe20e57307dece5228ba849641ec77e2d713b4bd02a23a8670035a0e60d0e37a4ffa2d3fd21cd539"

RPROVIDES:${PN} += "libsmartcols-devel-static"

RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
