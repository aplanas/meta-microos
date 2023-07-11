SUMMARY = "Wallstreet applet"
DESCRIPTION = "Budgie WallStreet is a mini-app to switch wallpapers on regular intervalls."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-wallstreet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "a229791849555047076b66c65ca745c67f05a0f3202fd440fd04f45bc9bc1d9702c9f6492c46074a71d60d9a13a7e6e495c0d896ab16c6f8197097410600d2cf"

RPROVIDES:${PN} += "budgie-wallstreet"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
