SUMMARY = "Color management tools for GNOME"
DESCRIPTION = "GNOME Color Manager is a session framework that makes it easy to manage, \
install and generate color profiles in the GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-color-manager-3.36.0-2.9.aarch64.rpm"
RPM_HASH = "65cc005bbf87d6681e6f956f9e6808fefcf0a8fe2226783e141d74c6acf87be38a317e46284cd53e772161794fd12036be46a9b6c3900c38216d3b9886587965"

RPROVIDES:${PN} += "gnome-color-manager"

RDEPENDS:${PN} += "colord \
colord-color-profiles \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
