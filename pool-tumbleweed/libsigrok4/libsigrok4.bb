SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok4-0.5.2-4.12.aarch64.rpm"
RPM_HASH = "f8a08179296516ce81613243286b7edef103ebfb13154eabe25eaee76d8746e6d19752acfdb9ceaf318e8786d880a11da4eb6fb698295858859c3c6f4b3a035c"

RPROVIDES:${PN} += "libsigrok.so.4 \
libsigrok4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libftdi1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhidapi-hidraw.so.0 \
libm.so.6 \
libserialport.so.0 \
libsigrok-data \
libtirpc.so.3 \
libusb-1.0.so.0 \
libzip.so.5"

inherit rpm
