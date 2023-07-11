SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-utils-2.37-4.4.aarch64.rpm"
RPM_HASH = "9c7dc89168b4f16bbcf7ce0a91ef178fb3b038146389b3634105376e85f71e92f05dbe554be8b70b9ddc377416dfafe16b33ccb3b9a0080cd63a08008d46934f"

RPROVIDES:${PN} += "glibc-utils \
libmemusage.so \
libpcprofile.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
