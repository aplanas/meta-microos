SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols-devel-static-2.39-3.1.aarch64.rpm"
RPM_HASH = "bd8b5a94a22c4a9c0bae9a4df527c5791e6660e4acf2acaaa8daff06d1d04c28dec92138d8a7262dd060c77375166cf26261532b1fcf3b1f2faf24ac46e1d414"

RPROVIDES:${PN} += "libsmartcols-devel-static"

RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
