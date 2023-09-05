SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38"

RPM_NAME = "glibc-utils-2.38-2.1.aarch64.rpm"
RPM_HASH = "f80e3bbd3976ffe1006820207a9b7ddcb93ef33b4a6935ad3254a22b0143b1730c740bdab537b00c485cd24d9b95ee8d0c1825142caa98be118b3d94b013afde"

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
