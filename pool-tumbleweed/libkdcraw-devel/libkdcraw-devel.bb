SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkdcraw-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "204b185fa9cf21dcf14d5e9ecaa793a1e1609f6184304cc507adc14f56b5061e54df0218eedf7941f026771947122a6099bc49f0167ebd57dd6bd5cbac1f319a"

RPROVIDES:${PN} += "cmake-KF5KDcraw \
libkdcraw-devel \
libkdcraw-kf5-devel"

RDEPENDS:${PN} += "libKF5KDcraw5"

inherit rpm
