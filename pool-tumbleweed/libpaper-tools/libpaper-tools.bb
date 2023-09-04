SUMMARY = "Tools that make use of libpaper"
DESCRIPTION = "This package provides the 'paper' binary"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libpaper-tools-2.1.1-1.1.aarch64.rpm"
RPM_HASH = "8738523777cec0a901888add2d1813148027057cd75d050ade22e296059e55c92aa4fc920328dc9a3dc4145f2a5cab272b820878059bfcdfb685f6afc4d7eaea"

RPROVIDES:${PN} += "libpaper-tools \
libpaper-utils \
paper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpaper.so.2"

inherit rpm
