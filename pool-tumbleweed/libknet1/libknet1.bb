SUMMARY = "Kronosnet core switching implementation"
DESCRIPTION = "The whole kronosnet core is implemented in this library. \
Please refer to the not-yet-existing documentation for further \
information."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-1.21-1.10.aarch64.rpm"
RPM_HASH = "cd2ca8813b5161e167d9083105266495229eb6cca8fa21cfc10f6f87e888dc677fb806b924584254ca5b299fe73524653190766755a78cf14f0e338ad279bfe0"

RPROVIDES:${PN} += "libknet.so.1()(64bit) \
libknet.so.1(LIBKNET)(64bit) \
libknet1 \
libknet1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
