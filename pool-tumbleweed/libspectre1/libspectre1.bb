SUMMARY = "Library for Rendering PostScript Documents"
DESCRIPTION = "libspectre is a small library for rendering Postscript documents. It \
provides a convenient easy to use API for handling and rendering \
Postscript documents."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "libspectre1-0.2.12-1.3.aarch64.rpm"
RPM_HASH = "a8d552bfa014c2a7a893417a7d47c3264611fbc0117cce1c1eefc803c5bd537aeb439586f1fc08d794bb7ce7c317613e83420a8219684be90cefec005cf4ff49"

RPROVIDES:${PN} += "libspectre.so.1()(64bit) \
libspectre1 \
libspectre1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgs.so.9()(64bit)"

inherit rpm
