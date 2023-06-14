SUMMARY = "GTS Runtime Library"
DESCRIPTION = "This package provides the GTS runtime library."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "libgts-0_7-5-0.7.6_p20121130-4.29.aarch64.rpm"
RPM_HASH = "caa7f1c3c16613cee434d4a44af77dc2aa1a084c47fe2a094614efd596a792e7fa6db351c88f0ee93701229ab6b2defa9177fb80074ad50c14cbca4d364fd272"

RPROVIDES:${PN} += "libgts-0-7-5 \
libgts-0.7.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6"

inherit rpm
