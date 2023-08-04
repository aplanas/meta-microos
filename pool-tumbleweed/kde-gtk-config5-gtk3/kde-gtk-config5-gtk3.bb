SUMMARY = "GTK3 Preview Helper for the GTK Configuration"
DESCRIPTION = "This package contains a helper application that allows previewing \
the GTK3 application style from within the application style KCM"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "kde-gtk-config5-gtk3-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "1171c0157728892876584e081ff906d14064fa4bb1f8c55e96adb15566468dfada7cb88296aa1e74b5810434d2a58cf80ace7a3a2948b778588d98768da5a82a"

RPROVIDES:${PN} += "kde-gtk-config5-gtk3"

RDEPENDS:${PN} += "kde-gtk-config5 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
