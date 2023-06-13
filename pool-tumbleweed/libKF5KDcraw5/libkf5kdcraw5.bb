SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKF5KDcraw5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8b6da55e471c32b5d3e958d988ae61491f968153fa83bf8e201784c12e1991a4becd3a1e579dffd3b68a4ef939dbb6338918af7dc83b8accb7725d19cd8fb292"

RPROVIDES:${PN} += "libKF5KDcraw.so.5()(64bit) \
libKF5KDcraw5 \
libKF5KDcraw5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libraw.so.23()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
