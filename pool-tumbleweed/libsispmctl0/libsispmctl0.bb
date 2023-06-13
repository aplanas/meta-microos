SUMMARY = "Libraries for sispmctl"
DESCRIPTION = "Libraries for the GEMBIRD Silver Shield PM device."
LICENSE = "GPL-2.0-only"

PV = "4.10"

RPM_NAME = "libsispmctl0-4.10-1.2.aarch64.rpm"
RPM_HASH = "0b90dab1e0b5fc29b7aede78a20adf421140b7b7e91d7ac799ea4d01a3bd64bba5a671f596c11530f92a6fb4aecdd475d46cb8f3803fb8145914df11a178808b"

RPROVIDES:${PN} += "libsispmctl.so.0()(64bit) \
libsispmctl0 \
libsispmctl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libusb-0.1.so.4()(64bit)"

inherit rpm
