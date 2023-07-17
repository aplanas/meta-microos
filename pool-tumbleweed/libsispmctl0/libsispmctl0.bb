SUMMARY = "Libraries for sispmctl"
DESCRIPTION = "Libraries for the GEMBIRD Silver Shield PM device."
LICENSE = "GPL-2.0-only"

PV = "4.11"

RPM_NAME = "libsispmctl0-4.11-1.1.aarch64.rpm"
RPM_HASH = "e7e42ab5a9586d27d1585879e0ec8f910f9336984b64ca2fb5c95373281297ded0cde2528978602dece5d1b0b02d9bf33845abf0dfd658cf985ae672d7efc145"

RPROVIDES:${PN} += "libsispmctl.so.0 \
libsispmctl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-0.1.so.4"

inherit rpm
