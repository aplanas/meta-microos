SUMMARY = "Shared library for Budgie plugins"
DESCRIPTION = "Shared library for budgie plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-plugin0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "51208fd29bd642a0a19c21864d2987a577619abb55bb9b2d109a608587ed8a9934e05046940f0a4cbb7cd9d552449990a6b63451028e17172c99ce7f5e8c9930"

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
