SUMMARY = "MATE Desktop keyboard configuration shared libraries"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmatekbd4-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "12f1834f2faea8828b85729c278f707a6bf5101775d7502ec9582bf0769e84e75d016927ba26752e7732e2e3ab0adca3c5b0c6ae3bfdd477aff12bd5fd4c8bc9"

RPROVIDES:${PN} += "libmatekbd \
libmatekbd.so.4()(64bit) \
libmatekbd4 \
libmatekbd4(aarch-64) \
libmatekbdui.so.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
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
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxklavier.so.16()(64bit) \
matekbd-common"

inherit rpm
