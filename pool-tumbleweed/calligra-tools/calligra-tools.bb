SUMMARY = "Various tools for the Calligra Suite"
DESCRIPTION = "This package contains various tools for the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-tools-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "c303266b07952465aeaa76c25abab8a72204273810ab7109deeacc27b91536709cb233612f5681b02315d93bcfabce0a3e91b295873a8c5611840c9a8aeda55b"

RPROVIDES:${PN} += "calligra-tools"

RDEPENDS:${PN} += "/sbin/ldconfig \
calligra \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcalligrasheetscommon.so.17 \
libcalligrasheetsodf.so.17 \
libflake.so.17 \
libkomain.so.17 \
libkoodf.so.17 \
libkopageapp.so.17 \
libkoplugin.so.17 \
libkowidgets.so.17 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
libwordsprivate.so.17"

inherit rpm
