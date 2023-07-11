SUMMARY = "Stand-alone libusrp for USRP1 from old gnuradio.git"
DESCRIPTION = "Stand-alone libusrp for USRP1 from old gnuradio.git."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "libusrp1-3.4.7-1.5.aarch64.rpm"
RPM_HASH = "cbb71104d37be82672d8024d24a11ff78887eb1fa9af91e9bee6dddf49208fd23d1ab28c6ed2da95c819a23abdec4db82115c50b92c1cb366f1680ba0b716ce3"

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
