SUMMARY = "Osmocom USB library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmosub library in particular contains routines for USB device \
access via libusb-1.0, integrated into the libosmocore select event loop."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmousb0-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "82826fc5e113e8ca761afbfe4bc166b2ed27b39d0ce7bb59a2c12cc56eaeee44f6f261bdb1845e4a1ff0534a1b42090910b6fdaf9e921f04e57256bb1188f9b1"

RPROVIDES:${PN} += "libosmousb.so.0 \
libosmousb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2 \
libusb-1.0.so.0"

inherit rpm
