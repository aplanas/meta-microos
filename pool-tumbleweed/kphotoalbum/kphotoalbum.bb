SUMMARY = "A photo administration utility"
DESCRIPTION = "KPhotoAlbum is a tool to help describe images, and to search in the pile \
of images. With KPhotoAlbum it is today possible to find any image \
in less than 5 seconds, let that be an image with a special person, \
an image from a special place, or even both."
LICENSE = "GPL-2.0-or-later"

PV = "5.10.0"

RPM_NAME = "kphotoalbum-5.10.0-2.1.aarch64.rpm"
RPM_HASH = "ccbc8e7e0dbdbd89df399168cf2dd941e909c175079c21f0a4b4f30d04fdc47815e55c98841616c238e11e836c4d02e9eba141e860047caa1980e78f482a7bea"

RPROVIDES:${PN} += "kphotoalbum \
libkpabase.so \
libkpaexif.so \
libkpathumbnails.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KDcraw.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQtAV.so.1 \
libQtAVWidgets.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmarblewidget-qt5.so.28 \
libphonon4qt5.so.4 \
libstdc++.so.6 \
libvlc.so.5 \
sqlite3"

inherit rpm
