SUMMARY = "A KDE Photo Manager"
DESCRIPTION = "digiKam is a simple digital photo management application for KDE, which \
allows you to import and organize your digital photos easily. The \
photos can be organized in albums, which can be sorted chronologically, \
by directory layout, or by custom collections. An easy-to-use interface \
that enables you to connect to your camera and preview, download, or \
delete your images, is provided."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-8.0.0-4.1.aarch64.rpm"
RPM_HASH = "3d39267947f608c128c83ae69302a0d04a00f2aa76a80fd6ca2cafe4981cf2fb056a72cd1cb2f1d0c8cb698780b00237ce41b530dfef952696bdf763f8eb9eed"

RPROVIDES:${PN} += "digikam \
digikam-doc \
digikam-plugin-color \
digikam-plugin-decorate \
digikam-plugin-enhance \
digikam-plugin-fxfilters \
digikam-plugin-transform"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
digikam-plugins \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libMagick++-7.Q16HDRI.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libc.so.6 \
libdigikamcore.so.8.0.0 \
libdigikamdatabase.so.8.0.0 \
libdigikamgui.so.8.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
