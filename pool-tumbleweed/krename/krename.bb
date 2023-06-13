SUMMARY = "A Batch Renamer by KDE"
DESCRIPTION = "KRename is a batch renamer by KDE. It allows renaming many files in \
one go. The filenames can be constructed from parts of the original \
filename, an increasing number, or accessing file metadata, like \
creation date or Exif information of an image."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "krename-5.0.2-1.3.aarch64.rpm"
RPM_HASH = "cf7b8a04bd5b2a01f9ce4504dfd403a716c6d6b828a9df478e19cf40e7df4f21daaf532ff47097d034b3b9fb8c39d6afcbbde0257ae5a9d9345410a55a0304fd"

RPROVIDES:${PN} += "application() \
application(org.kde.krename.desktop) \
krename \
krename(aarch-64) \
metainfo() \
metainfo(org.kde.krename.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JSApi.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpodofo.so.0.9.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libtag.so.1()(64bit)"

inherit rpm
