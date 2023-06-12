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
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libyate.so.6.4.0()(64bit) \
libyateradio.so.6.4.0()(64bit) \
yate-scripts"

inherit rpm
