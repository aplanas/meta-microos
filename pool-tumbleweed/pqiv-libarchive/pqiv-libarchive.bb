SUMMARY = "Backend libarchive for pqiv"
DESCRIPTION = "Backend libarchive/libarchive_cbx for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-libarchive-2.12-1.4.aarch64.rpm"
RPM_HASH = "57480c3c62d35e704fd618dc2030fb15dda69ed45b871b125363a4cc4d88d56f607d3651faa2dc8a0435bf14e65e3a7bc4f623e62547eabb1581f402b0176395"

RPROVIDES:${PN} += "pqiv-libarchive \
pqiv-libarchive(aarch-64)"
RDEPENDS:${PN} += "libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
pqiv"

inherit rpm
