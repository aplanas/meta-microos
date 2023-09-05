SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "6909a05cac5ab610d9ebbb8c9a88f33dccf1b6c7a5f3340c4a5a574b972d6529a8f54d2ca64b84d06b52d0eb274073f9829bc0975ff104226a661ed1f164d0e8"

RPROVIDES:${PN} += "calligra-extras-converter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkomain.so.17 \
libkostore.so.17 \
libstdc++.so.6"

inherit rpm
