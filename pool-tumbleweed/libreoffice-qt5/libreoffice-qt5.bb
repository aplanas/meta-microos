SUMMARY = "Qt5/KDE Frameworks interface for LibreOffice"
DESCRIPTION = "This package contains Qt5/KDE Frameworks interface rendering options for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-qt5-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "73a03743db246b74c43ce92ee1d85569a5f70b8292dca00e802059c0acba4ebfeac00eb30e539bc40471621e2b76ae40340cb660d47a2d0a19d97db7035258fa"

RPROVIDES:${PN} += "libkf5be1lo.so \
libreoffice-kde4 \
libreoffice-qt5 \
libvclplug-gtk3-kde5lo.so \
libvclplug-kf5lo.so \
libvclplug-qt5lo.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libatk-1.0.so.0 \
libboost-filesystem.so.1.82.0 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libi18nlangtag.so \
libjvmaccesslo.so \
libm.so.6 \
libmergedlo.so \
libpango-1.0.so.0 \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libvclplug-genlo.so \
libxcb-icccm.so.4 \
libxcb.so.1 \
rtld-GNU-HASH"

inherit rpm
