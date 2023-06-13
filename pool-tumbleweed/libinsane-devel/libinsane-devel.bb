SUMMARY = "Development files for libinsane"
DESCRIPTION = "Development libraries and header files for libinsane."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.9"

RPM_NAME = "libinsane-devel-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "b098ffe819c0109081154b29070edb069d52843bf76caed35ea124c32e17e2460253a63e2b746a645b6effbd7bcc327ef63c68acdb2e1e3fa4de05d1728a6155"

RPROVIDES:${PN} += "libinsane-devel \
libinsane-devel(aarch-64) \
pkgconfig(libinsane)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinsane1 \
pkgconfig(sane-backends) \
typelib-1_0-Libinsane-1_0"

inherit rpm
