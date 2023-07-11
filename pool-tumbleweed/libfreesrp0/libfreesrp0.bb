SUMMARY = "Library for FreeSRP"
DESCRIPTION = "libfreesrp is a C++ library that uses libusb to program and \
configure the FreeSRP hardware and both receive and transmit RF signals."
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "libfreesrp0-0.3.0-1.28.aarch64.rpm"
RPM_HASH = "cb244f31afd03a6884a497c97a99d6337b6e0b4fa1014ef23b9a16fd6318bee33224b360d7179e33e6746562819b3f7a2c84e0b1ade17d0efc7c8196dd0acac6"

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
