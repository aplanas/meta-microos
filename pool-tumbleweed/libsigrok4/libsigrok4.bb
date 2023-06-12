SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok4-0.5.2-4.12.aarch64.rpm"
RPM_HASH = "f8a08179296516ce81613243286b7edef103ebfb13154eabe25eaee76d8746e6d19752acfdb9ceaf318e8786d880a11da4eb6fb698295858859c3c6f4b3a035c"

RPROVIDES:${PN} += "libsigrok.so.4()(64bit) \
libsigrok4 \
libsigrok4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libftdi1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libhidapi-hidraw.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libserialport.so.0()(64bit) \
libsigrok-data \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libusb-1.0.so.0()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
