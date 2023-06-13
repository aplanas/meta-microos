SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "12.3.0+git1204"

RPM_NAME = "libgo21-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "df5c65026fef0e1d79243b8d65d70e41e87acfb6530b54fcb96c08356d5819e0f60da182549b90f80f6ded6f2f84d3a123dde1f48c2057be2044ff81b0ec40de"

RPROVIDES:${PN} += "libgo.so.21()(64bit) \
libgo21 \
libgo21(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
