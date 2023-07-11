SUMMARY = "Library for PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0+"

PV = "1.7.11"

RPM_NAME = "libacr38ucontrol0-1.7.11-7.26.aarch64.rpm"
RPM_HASH = "7f7a5f1e25007e9101a7fe66f576512be267cb5751adeba97066476e04a7c6918b15b00834cd971fa22b4343e7497d1b4521469890a816f8920834c6b841ae6e"

RPROVIDES:${PN} += "libacr38ucontrol.so.0 \
libacr38ucontrol0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcsclite.so.1"

inherit rpm
