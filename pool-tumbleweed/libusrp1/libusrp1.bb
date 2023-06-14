SUMMARY = "Stand-alone libusrp for USRP1 from old gnuradio.git"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "libusrp1-3.4.7-1.4.aarch64.rpm"
RPM_HASH = "a4686df8e18dd6094890b940379f6756be023acf96bab0f93567c6deb5c59ef1a259a5a26b3921e1b32a0d359b22c13dfddb9cfa69537b58b963874642458075"

RPROVIDES:${PN} += "libusrp.so.1 \
libusrp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
