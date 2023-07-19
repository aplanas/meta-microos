SUMMARY = "A photo administration utility"
DESCRIPTION = "KPhotoAlbum is a tool to help describe images, and to search in the pile \
of images. With KPhotoAlbum it is today possible to find any image \
in less than 5 seconds, let that be an image with a special person, \
an image from a special place, or even both."
LICENSE = "GPL-2.0-or-later"

PV = "5.11.0"

RPM_NAME = "kphotoalbum-5.11.0-1.1.aarch64.rpm"
RPM_HASH = "aeb07c78522dec9182a5f3e88a49dd78c4cac18a5950574e76e22cb8fa1311bcbcb5b29ad82135d70d37b2d9b30e638fca6a7f941dce18f0956ad931bd259bf5"

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
