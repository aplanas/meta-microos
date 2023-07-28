SUMMARY = "Various tools for the Calligra Suite"
DESCRIPTION = "This package contains various tools for the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-tools-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "c7d1c11b64c4ea1959be35c8bd1641045d0de412a119427bf18ed998f0f68132a45c089c8176e6f8f7ce0498feb30095f6293f0b411b124d678e3a17cfc1e012"

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
