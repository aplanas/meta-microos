SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) Protocol's File Transfer Feature"
DESCRIPTION = "ObexFTP works with all protocols supported by openobex (OpenOBEX). \
Currently, these are: \
 \
- irda (IrDA), \
- bluez-utils (BlueTooth) \
- setserial (Serial)"
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-0.24.2-1.22.aarch64.rpm"
RPM_HASH = "c5eef131767e92d0e03e0322a2d098f9bc764bcb5066e1721d62c782f82462eb1ad1dc5604dcc710c350a5dbded45dfc2297d4316516d761a50df749d295e424"

RPROVIDES:${PN} += "libbfb.so.1 \
libmulticobex.so.1 \
libobexftp.so.0 \
obexftp"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbluetooth.so.3 \
libc.so.6 \
libopenobex.so.2"

inherit rpm
