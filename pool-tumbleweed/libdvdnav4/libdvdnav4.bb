SUMMARY = "A DVD Navigation Library"
DESCRIPTION = "This library contains functions to display DVD video menus."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "libdvdnav4-6.1.1-1.10.aarch64.rpm"
RPM_HASH = "eee7cc36faaa0e1dde2ef63ffc49d2eccf962ec769855710428677f6e3eab14d66ca2e04327e8caf346ad4a5db572eb706e0c925cf2d12dbbc9ae82a47e3f415"

RPROVIDES:${PN} += "libdvdnav \
libdvdnav.so.4 \
libdvdnav4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8"

inherit rpm
