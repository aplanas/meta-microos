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

RPM_NAME = "libfinal0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "c3a6c250b1b54903bb8065bfac07672263a46bd6299cbef0b8ee37be81ca531c3a5278399dc698dbac7aeb43b9e616f40571847e0cecd704a8ba648873916a4d"

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
