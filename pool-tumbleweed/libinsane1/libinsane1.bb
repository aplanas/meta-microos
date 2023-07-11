SUMMARY = "Library for accesssing image scanners"
DESCRIPTION = "Libinsane is a library to access scanners on multiple platforms. \
It takes care of quirks of platforms and scanners."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane1-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "93bd22b16a6aa5513fffaf01d8676fd0a5e2cc589c997e86d685f1e03978b458e969b19ced02b22410197314630513b9ec08deabbdea73a33f056f34e1ac9c39"

RPROVIDES:${PN} += "libinsane.so.1 \
libinsane1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1"

inherit rpm
