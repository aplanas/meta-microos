SUMMARY = "Shared library providing extra GTK menu items in system indicators"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package contains shared libraries."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "libayatana-ido3-0_4-0-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "dc65587d3a3e720f367443a160dad2fe0b55c8fa9cc420954905d53e565ec85685e80d50cba49e14d484842edb981861d8e685db3325a40981e7af50294698c5"

RPROVIDES:${PN} += "libayatana-ido3-0.4.so.0()(64bit) \
libayatana-ido3-0_4-0 \
libayatana-ido3-0_4-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
