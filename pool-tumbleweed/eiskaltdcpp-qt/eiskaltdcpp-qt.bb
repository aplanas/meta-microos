SUMMARY = "Qt frontend for eiskaltdcpp"
DESCRIPTION = "This package contains the EiskaltDC++ program with GUI based on Qt. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-qt-2.4.2-1.14.aarch64.rpm"
RPM_HASH = "ac1eaceef72bff942f600f75ae0ab7483545e969b5ad68a404b2abcc6879f7b2f9ff95c3ada2f9e5a726481b82ff0f68e6e7fa6c906fe80834fd12c21d13dd94"

RPROVIDES:${PN} += "eiskaltdcpp-qt"

RDEPENDS:${PN} += "aspell \
eiskaltdcpp-common \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libaspell.so.15 \
libc.so.6 \
libeiskaltdcpp.so.2.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
