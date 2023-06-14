SUMMARY = "Xprint application utility routines"
DESCRIPTION = "libxprintapputil provides utility Xpau APIs allowing client \
applications to access information about and control Xprint jobs from \
an Xprint server."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXprintAppUtil1-1.0.1-13.1.aarch64.rpm"
RPM_HASH = "7f91a1517ddc2881f267acfa7120c837d1fdb3695a12c69b50eac9fa981e4f15024795d3838fb5b6cd322ec6abb6cb4e6bf9d4417c2113f413206de7a2013390"

RPROVIDES:${PN} += "libXprintAppUtil.so.1 \
libXprintAppUtil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXp.so.6 \
libXprintUtil.so.1 \
libc.so.6"

inherit rpm
