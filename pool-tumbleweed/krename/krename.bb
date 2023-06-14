SUMMARY = "A Batch Renamer by KDE"
DESCRIPTION = "KRename is a batch renamer by KDE. It allows renaming many files in \
one go. The filenames can be constructed from parts of the original \
filename, an increasing number, or accessing file metadata, like \
creation date or Exif information of an image."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.2"

RPM_NAME = "krename-5.0.2-1.3.aarch64.rpm"
RPM_HASH = "cf7b8a04bd5b2a01f9ce4504dfd403a716c6d6b828a9df478e19cf40e7df4f21daaf532ff47097d034b3b9fb8c39d6afcbbde0257ae5a9d9345410a55a0304fd"

RPROVIDES:${PN} += "krename"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JSApi.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libexiv2.so.27 \
libfreetype.so.6 \
libgcc-s.so.1 \
libpodofo.so.0.9.8 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
