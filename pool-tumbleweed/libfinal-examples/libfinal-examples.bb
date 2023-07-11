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

RPM_NAME = "libfinal-examples-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "783a87724b4f4b3f39ae3ff9358df83cfdf381d53b385abd549516969b8ecf8d439c52589379582a11a355e09ae935b6b7d03962f815ae5b9a96a61938be0114"

RPROVIDES:${PN} += "libfinal-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfinal.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
