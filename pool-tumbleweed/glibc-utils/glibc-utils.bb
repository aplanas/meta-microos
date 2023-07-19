SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-utils-2.37-5.1.aarch64.rpm"
RPM_HASH = "37b6159e1889e37b80899bcb91b6847a73102513307285b6b90af5947889957e62bbeea5928948aabed735782ad66d2bb93e507618d1588f60864a25bacba238"

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
