SUMMARY = "PC/SC Smart Card Library"
DESCRIPTION = "Supporting library for the PC/SC spy tool."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "libpcscspy0-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "91dd4e2f69e2a81bd08c967bed97be9a68f4bf10625708936346935c0dc7bd4df18c2e17acf81bbc0cb9cd92d646f7c7cc99af2fc53b4069439ce83286423657"

RPROVIDES:${PN} += "libpcscspy.so.0()(64bit) \
libpcscspy0 \
libpcscspy0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
