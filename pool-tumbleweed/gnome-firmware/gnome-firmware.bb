SUMMARY = "Install firmware on devices"
DESCRIPTION = "This application can update, reinstall and downgrade firmware on devices \
supported by fwupd."
LICENSE = "GPL-2.0-or-later"

PV = "43.1"

RPM_NAME = "gnome-firmware-43.1-1.3.aarch64.rpm"
RPM_HASH = "2ef9c03f1989be12016a94376f114e81f588a877935d834e15a5f0897d04d9ce87760f3db175e470f8e71cd141b42debd5ab3c1fdc281a1378b277926c8c7ad2"

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
