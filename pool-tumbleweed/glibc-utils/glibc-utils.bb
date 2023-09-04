SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38"

RPM_NAME = "glibc-utils-2.38-1.1.aarch64.rpm"
RPM_HASH = "0b1c1bb64e073aa947dc65e73e3233f0c6fd31170344e18b2cb4b2aa465f788d3fd3a9943ce243910e8c77ac95beab42081b883b3e4110c2402e651c9da58837"

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
