SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5KDcraw5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0ec52e9ab39e0fd060f564e1128cebf161b0a83fe62a9fad0c4cf6b1d1a349fbec51636186ec20506894b2094bd679d8e170078007f6a108e3b2670fead507c5"

RPROVIDES:${PN} += "libKF5KDcraw.so.5 \
libKF5KDcraw5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
