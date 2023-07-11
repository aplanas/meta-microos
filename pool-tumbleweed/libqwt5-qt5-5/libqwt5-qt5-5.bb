SUMMARY = "Shared library for Qt Widgets"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for qwt."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "libqwt5-qt5-5-5.2.3_qt5+git20181129.2819734-3.19.aarch64.rpm"
RPM_HASH = "3257c7e333e0629e65ce066bffa34594df691ac662a0c02dc32045698d23b1ba13bd0b083eb28de5f9648aec1712155c89457d666a3ca0c3196c037fc40a81d1"

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
