SUMMARY = "Library for Lime Suite"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms and other tools for developing with LMS7-based hardware."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "libLimeSuite22_09-1-22.09.1-2.3.aarch64.rpm"
RPM_HASH = "094f586cb06090fb7f5e0b8a92cb0263b56e91bcb0746b3550f693ac5f81893438c8c4ba6b6b71573273e3f0626b8060f9c995033809089f67f0ac8b97a455f2"

RPROVIDES:${PN} += "libLimeSuite.so.22.09-1 \
libLimeSuite22-09-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
limesuite-udev"

inherit rpm
