SUMMARY = "USB CEC adapter communication library"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "libcec6-6.0.2-3.1.aarch64.rpm"
RPM_HASH = "c63737b88b08d0ad71233ee0278a5cd508c8f9fa721001eb9cca872e41108fbef0eeb519f90b447fc356407561422b5b4f9017b24c60c0602cdb3073d85b05af"

RPROVIDES:${PN} += "libcec.so.6 \
libcec6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libp8-platform.so.2 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
