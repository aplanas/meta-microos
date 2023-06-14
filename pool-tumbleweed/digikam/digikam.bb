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

RPROVIDES:${PN} += "digikam \
digikam-doc \
digikam-plugin-color \
digikam-plugin-decorate \
digikam-plugin-enhance \
digikam-plugin-fxfilters \
digikam-plugin-transform"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
