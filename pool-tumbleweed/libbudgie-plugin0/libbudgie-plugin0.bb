SUMMARY = "Shared library for Budgie plugins"
DESCRIPTION = "Shared library for budgie plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-plugin0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "7a615408cc1c4990f43e222d907fc2d929c52d183845bae4bc58357d8f06a6c94511eca271af17d7d4dbd786d98c8a1103afdf86bfbafd47e083149836ea646b"

RPROVIDES:${PN} += "libbudgie-plugin.so.0 \
libbudgie-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
