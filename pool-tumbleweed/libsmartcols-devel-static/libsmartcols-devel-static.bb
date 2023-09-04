SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libsmartcols-devel-static-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "b33761ea7f124eb83010eab792005244e16ca12f149382f076f066e16a4df26e38c0e35ecb555ddd976f5ae5433cca98c915ebddf80088f3c506d406ab1cac63"

RPROVIDES:${PN} += "libsmartcols-devel-static"

RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
