SUMMARY = "Console widget toolkit"
DESCRIPTION = "FINAL CUT is a class library and widget toolkit with full mouse \
support for creating a text-based user interface. The library supports \
the programmer to develop an application for the text console. It allows \
the simultaneous handling of multiple windows on the screen. \
The C++ class design was inspired by the Qt framework. It provides \
common controls like dialog windows, push buttons, check boxes, \
radio buttons, input lines, list boxes, status bars and so on."
LICENSE = "LGPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "libfinal0-0.9.0-1.2.aarch64.rpm"
RPM_HASH = "644d70e0a0907d7fe201c795b2763438a73b5b4e09b4db1148e407f0bfc63a6db9ab5e0ac00ecf45149cfa8daf4507fdd256cd11adba428e4e727456704c48d0"

RPROVIDES:${PN} += "libfinal.so.0 \
libfinal0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpm.so.2 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
