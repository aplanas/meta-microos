SUMMARY = "Install firmware on devices"
DESCRIPTION = "This application can update, reinstall and downgrade firmware on devices \
supported by fwupd."
LICENSE = "GPL-2.0-or-later"

PV = "43.1"

RPM_NAME = "gnome-firmware-43.1-1.4.aarch64.rpm"
RPM_HASH = "773579f902b84bdbb2991dffbbd26d32d74e7a761368552644a0fbb82436deb337d81c809bc5e6c6536230d38bb9fcb88ee03fbaf611ae54d0254fbdfa2c5e8e"

RPROVIDES:${PN} += "gnome-firmware \
gnome-firmware-updater \
gnome-firmware-updater-lang"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libfwupd.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libxmlb.so.2"

inherit rpm
