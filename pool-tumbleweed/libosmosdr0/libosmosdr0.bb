SUMMARY = "Libraries for OsmoSDR"
DESCRIPTION = "OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "libosmosdr0-0.1+git.20151211-1.24.aarch64.rpm"
RPM_HASH = "66be4f2f7cb4ff21b6d76c1667d9b7edf18e4298b1d1d12aed880d55d84c66d2097a0305ad7b89695b9c3850fd78e73fd6e30341c0e7fa833df0efcfbca5a008"

RPROVIDES:${PN} += "libosmosdr.so.0 \
libosmosdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
