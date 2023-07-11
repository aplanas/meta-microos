SUMMARY = "Archive Manager for Deepin Desktop"
DESCRIPTION = "Archive Manager is a fast and lightweight application for creating and \
extracting archives."
LICENSE = "GPL-3.0-or-later"

PV = "5.12.13"

RPM_NAME = "deepin-compressor-5.12.13-1.4.aarch64.rpm"
RPM_HASH = "cb1a6b6eef4ed1b6057d3c3121f7995e973ecbb6376659b5b4018fa10aed5f1a829bc6a79cff93770489df1f1588cb76a0b25359a285afc7a3380f70bc65006d"

RPROVIDES:${PN} += "deepin-compressor \
libbz2plugin.so \
libcli7zplugin.so \
libclirarplugin.so \
libcompressor-interface.so \
libgzplugin.so \
liblibpigzplugin.so \
liblibzipplugin.so \
libminizipplugin.so \
libreadonlylibarchiveplugin.so \
libreadwritelibarchiveplugin.so \
libxzplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libarchive.so.13 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libminizip.so.1 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
