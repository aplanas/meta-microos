SUMMARY = "Private library for Budgie"
DESCRIPTION = "Private library for Budgie desktop to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-private0-10.7.2+0-1.2.aarch64.rpm"
RPM_HASH = "2a24696d17914b48faaf7b862c7b36b303944217d7dc1f8ece4bc61ac966432d0b423b5853b7900548d551b5491f07291fad3e5ecbd7a1913410971bd248d993"

RPROVIDES:${PN} += "libbudgie-private.so.0 \
libbudgie-private0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
