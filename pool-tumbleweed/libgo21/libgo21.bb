SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "12.3.0+git1204"

RPM_NAME = "libgo21-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "7505605e8d5ec61c3ba2bf3e30ede2088fa1310931763beaf0f9c98e8c4f5c551e664b40fc735594a60260287e7e10e64522537555b8ce44a0d091480ee0bfb9"

RPROVIDES:${PN} += "libgo.so.21 \
libgo21"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
