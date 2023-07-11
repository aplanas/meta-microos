SUMMARY = "API for talking to logic analyzer hardware"
DESCRIPTION = "libsigrok is a shared library written in C which provides the basic API \
for talking to logic analyzer hardware and reading/writing the acquired data \
into various input/output file formats."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "libsigrok4-0.5.2-4.13.aarch64.rpm"
RPM_HASH = "66bebbcef3998b9bb2ad4dcdf6f3b14d9635529c18c067086a87cde17a22fd18f432d60fdea91a6f5a0caa5961bf8d9415fb853241f015d043593374425767cc"

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
