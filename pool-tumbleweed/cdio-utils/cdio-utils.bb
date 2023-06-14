SUMMARY = "Utility programs making use of libcdio, a CD-ROM access library"
DESCRIPTION = "This package contains a number of utility programs that make use of \
libcdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "cdio-utils-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "13481a04d9c2cb03b122a22181b99057d1d420416094e54abfe3743d442084655fa7c32ae498880de8bc3ca904638b1ef18d6d271114972d91dd01f7e79d1554"

RPROVIDES:${PN} += "cdio-utils \
libcdio-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcddb.so.2 \
libcdio.so.19 \
libiso9660.so.11 \
libncurses.so.6 \
libtinfo.so.6 \
libudf.so.0 \
libvcdinfo.so.0"

inherit rpm
