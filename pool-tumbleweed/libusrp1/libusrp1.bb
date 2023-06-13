SUMMARY = "Stand-alone libusrp for USRP1 from old gnuradio.git"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "libusrp1-3.4.7-1.4.aarch64.rpm"
RPM_HASH = "a4686df8e18dd6094890b940379f6756be023acf96bab0f93567c6deb5c59ef1a259a5a26b3921e1b32a0d359b22c13dfddb9cfa69537b58b963874642458075"

RPROVIDES:${PN} += "libusrp.so.1()(64bit) \
libusrp1 \
libusrp1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
