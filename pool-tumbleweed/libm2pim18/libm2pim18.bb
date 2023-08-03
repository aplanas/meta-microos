SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libm2pim18-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "055f357d5778e40f90910b77e6b0646ac23a4b9c53ef8aca672ccc9c45152152c2d64f2cd5535a7ed2426c462f3c26fe945768362d8e6053e5a3e230d1234123"

RPROVIDES:${PN} += "libm2pim.so.18 \
libm2pim18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
