SUMMARY = "GSM BTS based on Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine designed to implement PBX and IVR solutions \
for small to large scale projects. \
This module implements a 2G GSM BTS for Yate. \
At least one transceiver package must also be installed for \
interfacing with the hardware."
LICENSE = "GPL-2.0-or-later & AGPL-3.0-only"

PV = "6.1.0"

RPM_NAME = "yate-bts-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "a56987d3791c130c5b00be373a421f7a1fe464cc759d808dc95f4b9f1be6616c82a02c7bff4f741b5de0031206e71f57ed3c88997560a75d35895450a72b88c3"

RPROVIDES:${PN} += "config(yate-bts) \
yate-bts \
yate-bts(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/php \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libyate.so.6.4.0()(64bit) \
libyateradio.so.6.4.0()(64bit) \
yate-scripts"

inherit rpm
