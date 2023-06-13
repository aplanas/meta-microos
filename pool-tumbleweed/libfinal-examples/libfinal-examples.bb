SUMMARY = "Example files for the FINAL CUT library"
DESCRIPTION = "FINAL CUT is a class library and widget toolkit with full mouse \
support for creating a text-based user interface. The library supports \
the programmer to develop an application for the text console. It allows \
the simultaneous handling of multiple windows on the screen. \
The C++ class design was inspired by the Qt framework. It provides \
common controls like dialog windows, push buttons, check boxes, \
radio buttons, input lines, list boxes, status bars and so on."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "libfinal-examples-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "e6e224e6b47ccdfc533ef81c6c3b4e8d68f2701c41f82bf45090e06efb31be7d988a5a63b4217c92d42dfd2f7082d3234f0ec767ee9169c2660a881d519f2c64"

RPROVIDES:${PN} += "libfinal-examples \
libfinal-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfinal.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
