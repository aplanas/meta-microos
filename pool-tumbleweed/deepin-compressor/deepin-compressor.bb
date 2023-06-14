SUMMARY = "Archive Manager for Deepin Desktop"
DESCRIPTION = "Archive Manager is a fast and lightweight application for creating and \
extracting archives."
LICENSE = "GPL-3.0-or-later"

PV = "5.12.13"

RPM_NAME = "deepin-compressor-5.12.13-1.3.aarch64.rpm"
RPM_HASH = "077d59fe0f27e8863a36878dc054454c1e87121c43032ec293658f68649d1679868f7bc2672c6260a5e82a9b28df185383492c822787aac8ff83c8ec68c08b19"

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
