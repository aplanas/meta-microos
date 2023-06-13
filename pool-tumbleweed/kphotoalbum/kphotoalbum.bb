SUMMARY = "A photo administration utility"
DESCRIPTION = "KPhotoAlbum is a tool to help describe images, and to search in the pile \
of images. With KPhotoAlbum it is today possible to find any image \
in less than 5 seconds, let that be an image with a special person, \
an image from a special place, or even both."
LICENSE = "GPL-2.0-or-later"

PV = "5.10.0"

RPM_NAME = "kphotoalbum-5.10.0-1.1.aarch64.rpm"
RPM_HASH = "7c7ac4cebb01d29c7e033e1b9e379ccaba4aca802c00bc5ec77a4d90c14883ec2fa4c246d78ed569659a1dad8a360b24ee4f7c84817824e8ffeb0a8811a9b1b8"

RPROVIDES:${PN} += "application() \
application(org.kde.kphotoalbum-import.desktop) \
application(org.kde.kphotoalbum.desktop) \
application(org.kde.kphotoalbum.open-raw.desktop) \
kphotoalbum \
kphotoalbum(aarch-64) \
libkpabase.so()(64bit) \
libkpaexif.so()(64bit) \
libkpathumbnails.so()(64bit) \
metainfo() \
metainfo(org.kde.kphotoalbum.appdata.xml) \
mimehandler(application/vnd.kde.kphotoalbum-import) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/tiff) \
mimehandler(image/x-adobe-dng) \
mimehandler(image/x-canon-cr2) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-nikon-nef) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-pentax-pef) \
mimehandler(image/x-raw) \
mimehandler(image/x-sony-arw)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KDcraw.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQtAV.so.1()(64bit) \
libQtAVWidgets.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmarblewidget-qt5.so.28()(64bit) \
libphonon4qt5.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libvlc.so.5()(64bit) \
sqlite3"

inherit rpm
