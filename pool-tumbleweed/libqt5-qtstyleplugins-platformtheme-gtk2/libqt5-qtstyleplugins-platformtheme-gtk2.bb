SUMMARY = "Qt 5 gtk2 plugin"
DESCRIPTION = "Qt 5 plugin for better integration with gtk-based desktop enviroments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-platformtheme-gtk2-5.0.0+git20170311-10.11.aarch64.rpm"
RPM_HASH = "8835c8cf2402cdca5eda785d6f8cd49680cc645d2a95a3363896718bde49ebb0249364b4e200f526f024fc6e76a809b7e93269c1a04cf05183548f01aa36b5f7"

RPROVIDES:${PN} += "libqgtk2.so \
libqgtk2style.so \
libqt5-qtstyleplugins-platformtheme-gtk2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
