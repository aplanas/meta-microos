SUMMARY = "Qtdbusextended libraries"
DESCRIPTION = "This package contains the libraries for qtdbusextended"
LICENSE = "LGPL-2.1+"

PV = "0.0.3"

RPM_NAME = "libdbusextended-qt5-1-0.0.3-1.8.aarch64.rpm"
RPM_HASH = "98f5c71729692c8d3a6474da0c7ac22e6c2fe9bfc6417da0ccd07e2cb16a43f05052640fac7da58e1ff0a4ecf76bded4dfb66539e4495b9f4056873556d2cd31"

RPROVIDES:${PN} += "libdbusextended-qt5-1 \
libdbusextended-qt5-1(aarch-64) \
libdbusextended-qt5.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
