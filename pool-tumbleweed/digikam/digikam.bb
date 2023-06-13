SUMMARY = "A KDE Photo Manager"
DESCRIPTION = "digiKam is a simple digital photo management application for KDE, which \
allows you to import and organize your digital photos easily. The \
photos can be organized in albums, which can be sorted chronologically, \
by directory layout, or by custom collections. An easy-to-use interface \
that enables you to connect to your camera and preview, download, or \
delete your images, is provided."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-8.0.0-3.2.aarch64.rpm"
RPM_HASH = "b1d3a47ed7120e9acf2d10d77080de64697b48d9ea4a5149f37b5554604efdd75cdea90ba3748339b3b8692ca3cbe0798a304727500d80b0905b36fa203dbb5f"

RPROVIDES:${PN} += "application() \
application(org.kde.digikam.desktop) \
digikam \
digikam(aarch-64) \
digikam-doc \
digikam-plugin-color \
digikam-plugin-decorate \
digikam-plugin-enhance \
digikam-plugin-fxfilters \
digikam-plugin-transform \
metainfo() \
metainfo(org.kde.digikam.appdata.xml) \
mimehandler(x-content/image-dcf) \
mimehandler(x-content/image-picturecd)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
digikam-plugins \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdigikamcore.so.8.0.0()(64bit) \
libdigikamdatabase.so.8.0.0()(64bit) \
libdigikamgui.so.8.0.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
