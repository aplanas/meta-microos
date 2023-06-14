SUMMARY = "Qt frontend for eiskaltdcpp"
DESCRIPTION = "This package contains the EiskaltDC++ program with GUI based on Qt. \
EiskaltDC++ is a program that uses the Direct Connect and Advanced \
Direct Connect protocols. It is compatible with DC++, AirDC++, \
FlylinkDC++ and other DC clients. EiskaltDC++ also interoperates with \
all common DC hub software."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-qt-2.4.2-1.13.aarch64.rpm"
RPM_HASH = "aca91401ca84a25406cd3d80fa511185ddfd30a8ec77d6939c99817a0cd482a410f1894d3e0190c5c191782eb9c0a5c5af76d93785a2439738f5c4c6062487f6"

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
