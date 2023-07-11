SUMMARY = "Core SANE library"
DESCRIPTION = "This contains the SANE library. Individual scanner backends are provided \
by sane-backends or third party packages."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain"

PV = "1.2.1"

RPM_NAME = "libsane1-1.2.1-1.2.aarch64.rpm"
RPM_HASH = "e89813286109ffc91980451c3156f045e1c32732b07f87d50735f721941a1534cce4aeb8a8abda86b25f59a54298675594eab95f07e79f18a3ddc526737b8510"

RPROVIDES:${PN} += "libsane.so.1 \
libsane1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
libxml2.so.2"

inherit rpm
