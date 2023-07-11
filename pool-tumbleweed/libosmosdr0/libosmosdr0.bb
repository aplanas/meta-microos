SUMMARY = "Libraries for OsmoSDR"
DESCRIPTION = "OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "libosmosdr0-0.1+git.20151211-1.25.aarch64.rpm"
RPM_HASH = "c025839230cedc2e88927cb640b68f87819ae2f1393c56ba8d8d9b83ae0d7e9fcc9a5d758f92d78b66029bb8fb2aa5949ef957a4d1be46ec32b7a2f8ffb98afd"

RPROVIDES:${PN} += "libosmosdr.so.0 \
libosmosdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
