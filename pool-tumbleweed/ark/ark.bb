SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ark-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "62067421d4012fab03a43f02eeaa0bba44e030079a790baf79ebf0b749e80fce77c351b521a28bd63c93c18b99874c6bddd7f76f91e3d6431829148933ae163a"

RPROVIDES:${PN} += "application() \
application(org.kde.ark.desktop) \
ark \
ark(aarch-64) \
metainfo() \
metainfo(org.kde.ark.appdata.xml) \
mimehandler(application/arj) \
mimehandler(application/gzip) \
mimehandler(application/vnd.debian.binary-package) \
mimehandler(application/vnd.ms-cab-compressed) \
mimehandler(application/vnd.rar) \
mimehandler(application/x-7z-compressed) \
mimehandler(application/x-archive) \
mimehandler(application/x-arj) \
mimehandler(application/x-bcpio) \
mimehandler(application/x-bzip) \
mimehandler(application/x-bzip-compressed-tar) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-compress) \
mimehandler(application/x-compressed-tar) \
mimehandler(application/x-cpio) \
mimehandler(application/x-cpio-compressed) \
mimehandler(application/x-deb) \
mimehandler(application/x-iso9660-appimage) \
mimehandler(application/x-java-archive) \
mimehandler(application/x-lha) \
mimehandler(application/x-lrzip) \
mimehandler(application/x-lrzip-compressed-tar) \
mimehandler(application/x-lz4) \
mimehandler(application/x-lz4-compressed-tar) \
mimehandler(application/x-lzip) \
mimehandler(application/x-lzip-compressed-tar) \
mimehandler(application/x-lzma) \
mimehandler(application/x-lzma-compressed-tar) \
mimehandler(application/x-lzop) \
mimehandler(application/x-rpm) \
mimehandler(application/x-source-rpm) \
mimehandler(application/x-stuffit) \
mimehandler(application/x-sv4cpio) \
mimehandler(application/x-sv4crc) \
mimehandler(application/x-tar) \
mimehandler(application/x-tarz) \
mimehandler(application/x-tzo) \
mimehandler(application/x-xar) \
mimehandler(application/x-xz) \
mimehandler(application/x-xz-compressed-tar) \
mimehandler(application/x-zstd-compressed-tar) \
mimehandler(application/zip) \
mimehandler(application/zlib) \
mimehandler(application/zstd)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkerfuffle.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
