SUMMARY = "Leptonica tools"
DESCRIPTION = "Programs for manipulating images."
LICENSE = "BSD-2-Clause"

PV = "1.83.1"

RPM_NAME = "leptonica-tools-1.83.1-1.3.aarch64.rpm"
RPM_HASH = "f2904e2223b97498423754cc8023b27226bee13252e7e2aa004f20a3273595d95d153c689cdf1997a5d3f44bd1e1451fd6aae0b000e87e723d7fa965a2fd9d92"

RPROVIDES:${PN} += "leptonica-tools \
leptonica-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libleptonica.so.6()(64bit)"

inherit rpm
