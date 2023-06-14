SUMMARY = "Library for accesssing image scanners"
DESCRIPTION = "Libinsane is a library to access scanners on multiple platforms. \
It takes care of quirks of platforms and scanners."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.9"

RPM_NAME = "libinsane1-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "3669c1306c3fc7ad8156d14e94303289bcf3b324380c2f6a35d345d231a942f87fb710e8d3dfc3568e70099097879bfaddf4ec34020927172fa6ed55791423a9"

RPROVIDES:${PN} += "libinsane.so.1 \
libinsane1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1"

inherit rpm
