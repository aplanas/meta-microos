SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7552"

RPM_NAME = "libm2pim18-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "b4f65ef6f9402254d0115dee569acf37532082f2e7c5724d7b0bfdcb47696b66af57522d914c428141442da9664a9d80b16c568d7481bb700bad2381e93bba45"

RPROVIDES:${PN} += "libm2pim.so.18 \
libm2pim18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
