SUMMARY = "USB CEC adapter communication library"
DESCRIPTION = "In combination with the right hardware, libcec allows to control \
a device with a TV remote control utilizing existing HDMI \
cabling."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.2"

RPM_NAME = "libcec6-6.0.2-2.9.aarch64.rpm"
RPM_HASH = "1055448beaa6192648fb83f1e45912432dbef705e2db839b4dfaee38d68834765188564919aefacdca53076e679c56f0a5e607f2d86ad7ecb15a40ecc937682e"

RPROVIDES:${PN} += "libcec.so.6()(64bit) \
libcec6 \
libcec6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libp8-platform.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
