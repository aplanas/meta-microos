SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-utils-2.37-4.1.aarch64.rpm"
RPM_HASH = "e4a4755f69920455da3b2dd7d7a3103fddc2b1ee90e54c10cd84de8f5c2db069472c99f3910419fb8573ed02d214103430c54fcac5b95e9918ae44a182f21712"

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
