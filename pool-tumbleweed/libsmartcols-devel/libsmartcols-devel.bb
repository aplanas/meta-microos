SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols-devel-2.39-2.1.aarch64.rpm"
RPM_HASH = "6305a5395525c5cf732f2f5a21cdab21b9103b04c26ea3fc565d76090dd570c8c09a6b021d66150d6a383d68efd77f1eb53f9e558113756a6f8b20eb68740fb0"

RPROVIDES:${PN} += "libsmartcols-devel \
pkgconfig-smartcols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmartcols1"

inherit rpm
