SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7597"

RPM_NAME = "libm2cor18-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "24d08317a47838b81da70b00d2d737693cc69f23a63903908e3d700631d6af4a27eebdbe16de6ad14fed2b668279e2819c8f9b47d1452e6b31b2cf463918de1d"

RPROVIDES:${PN} += "libm2cor.so.18 \
libm2cor18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
