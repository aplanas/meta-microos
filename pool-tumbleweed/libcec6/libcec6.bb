SUMMARY = "USB CEC adapter communication library"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "libcec6-6.0.2-2.9.aarch64.rpm"
RPM_HASH = "1055448beaa6192648fb83f1e45912432dbef705e2db839b4dfaee38d68834765188564919aefacdca53076e679c56f0a5e607f2d86ad7ecb15a40ecc937682e"

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
