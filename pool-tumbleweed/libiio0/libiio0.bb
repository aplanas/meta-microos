SUMMARY = "Industrial I/O library"
DESCRIPTION = "Library for industrial I/O."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24"

RPM_NAME = "libiio0-0.24-1.4.aarch64.rpm"
RPM_HASH = "50b2c10345dd371cb2f99e94125a9992b5c13db05fe7d8f8c391455b0d71edbdd35eab720206647500f4786600dded200b5c8c58a0dfb182e583f6eb3e784902"

RPROVIDES:${PN} += "libiio.so.0()(64bit) \
libiio0 \
libiio0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
