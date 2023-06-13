SUMMARY = "Osmocom USB library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmousb0-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "2055a31812ffe79cf53de4e93dd717769df59623f092c9931505291648f4f3979c61a00c242f53e526c2af64b51cd26629cc2b706ad63ca7d2c50b31b55629c0"

RPROVIDES:${PN} += "libosmousb.so.0()(64bit) \
libosmousb0 \
libosmousb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
