SUMMARY = "Backend libarchive for pqiv"
DESCRIPTION = "Backend libarchive/libarchive_cbx for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "pqiv-libarchive-2.12-1.4.aarch64.rpm"
RPM_HASH = "57480c3c62d35e704fd618dc2030fb15dda69ed45b871b125363a4cc4d88d56f607d3651faa2dc8a0435bf14e65e3a7bc4f623e62547eabb1581f402b0176395"

RPROVIDES:${PN} += "pqiv-libarchive"

RDEPENDS:${PN} += "libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
pqiv"

inherit rpm
