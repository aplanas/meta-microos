SUMMARY = "This package contains the paper library"
DESCRIPTION = "This package provides the paper library"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libpaper2-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "73d1d9dac577ffdcd56f6ed2e92da09a725265c7705a74b554ccac2295a4433ec424823b39a8e4d4e1b585d6a6e22dad6973b4b7d21de8f876525b542638d9df"

RPROVIDES:${PN} += "libpaper.so.2()(64bit) \
libpaper2 \
libpaper2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpaper"

inherit rpm
