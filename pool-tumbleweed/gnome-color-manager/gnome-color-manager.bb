SUMMARY = "Color management tools for GNOME"
DESCRIPTION = "GNOME Color Manager is a session framework that makes it easy to manage, \
install and generate color profiles in the GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-color-manager-3.36.0-2.10.aarch64.rpm"
RPM_HASH = "8bd644fbc3e3dedaee36b18379c0faa85dc5d88cfbe88f875404ec48d0bf988d67b8f0f126caedff221a2180385da0868d1fc5ffe159a10e378cb871ab95bf24"

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
