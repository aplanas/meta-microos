SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) Protocol's File Transfer Feature"
DESCRIPTION = "ObexFTP works with all protocols supported by openobex (OpenOBEX). \
Currently, these are: \
 \
- irda (IrDA), \
- bluez-utils (BlueTooth) \
- setserial (Serial)"
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-0.24.2-1.24.aarch64.rpm"
RPM_HASH = "d762c032441225478bbbe7092ef66cd6db0fcae95608f03a9f7d49ecca49bdfab06daeb509cd842715bfa4dbf6a35d62669bb037192205c8af286aadae5441dc"

RPROVIDES:${PN} += "libbfb.so.1 \
libmulticobex.so.1 \
libobexftp.so.0 \
obexftp"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbluetooth.so.3 \
libc.so.6 \
libopenobex.so.2"

inherit rpm
