SUMMARY = "Shared library for Qt Widgets"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for qwt."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "libqwt5-qt5-5-5.2.3_qt5+git20181129.2819734-3.18.aarch64.rpm"
RPM_HASH = "9a63868c77ec165c047330b7f10e4e52c2dfa8ad908fee0806ef331beba892c1190fb8619ced249062ed9d9a04664b71a3f74630ca8ec8994caadb3c2ac7acd1"

RPROVIDES:${PN} += "libqwt5-qt5-5 \
libqwt5-qt5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
