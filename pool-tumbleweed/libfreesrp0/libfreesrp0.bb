SUMMARY = "Library for FreeSRP"
DESCRIPTION = "libfreesrp is a C++ library that uses libusb to program and \
configure the FreeSRP hardware and both receive and transmit RF signals."
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "libfreesrp0-0.3.0-1.27.aarch64.rpm"
RPM_HASH = "f87eef5b8a688e3a0b19cd86ab1929a41fef2d17b05bcaca18daa7c44eb096461b277dc82cc6b1d6a0a5298d6b0a7180fa01033b3695e03b1dc683d354b0a5d6"

RPROVIDES:${PN} += "libfreesrp.so.0 \
libfreesrp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
freesrp-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
