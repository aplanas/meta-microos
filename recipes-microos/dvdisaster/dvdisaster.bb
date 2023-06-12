SUMMARY = "Additional error protection for CD/DVD media"
DESCRIPTION = "dvdisaster provides a margin of safety against data loss on CD and DVD media \
caused by scratches or aging. It creates error correction data, \
which is used to recover unreadable sectors if the disc becomes damaged \
at a later time."
LICENSE = "GPL-3.0-or-later"

PV = "0.79.6"

RPM_NAME = "dvdisaster-0.79.6-3.7.aarch64.rpm"
RPM_HASH = "b29a80371566fc84adcba7abded7ea7f39a2e86c1f4296ff93a159ab1887075a0b4ec1ebf84def9d2d888dda195fdc07d94b813a00df7170e7fc9484a6d2e94a"

RPROVIDES:${PN} += "dvdisaster \
dvdisaster(aarch-64)"
RDEPENDS:${PN} += "dvdisaster-docs \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
