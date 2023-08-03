SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libsmartcols-devel-static-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "f44153f5c648b0fa3e68ac97dea0471b011c930c4ae5314a3be29ea6399c5a1bac974f8644b153a39bbe29684047ec3ea914bbcb3a33ace1283d556d1f8ca5d3"

RPROVIDES:${PN} += "libsmartcols-devel-static"

RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
