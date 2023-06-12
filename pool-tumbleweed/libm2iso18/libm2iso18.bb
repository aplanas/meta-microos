SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.1.1+git7364"

RPM_NAME = "libm2iso18-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "2ce9e41e8ba0824d77e457689295a9cb54d3fbc6edf323343ce1e83879b7a37ad43f22563971b65233a6b5061a4f5b82e783daf37dbca85b02f18025d1450971"

RPROVIDES:${PN} += "libm2iso.so.18()(64bit) \
libm2iso18 \
libm2iso18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
