SUMMARY = "ObexFTP Implements the Object Exchange (OBEX) Protocol's File Transfer Feature"
DESCRIPTION = "ObexFTP works with all protocols supported by openobex (OpenOBEX). \
Currently, these are: \
 \
- irda (IrDA), \
- bluez-utils (BlueTooth) \
- setserial (Serial)"
LICENSE = "GPL-2.0-or-later"

PV = "0.24.2"

RPM_NAME = "obexftp-0.24.2-1.25.aarch64.rpm"
RPM_HASH = "ce65ae26deb98030fefae34b1347315cd3224c0ccb0820f1d491a4ca40e64602a1b92a392e27aedf889695ba01551a3d8256d3cb0c2cf311d5e618aeeaac8357"

RPROVIDES:${PN} += "libbfb.so.1 \
libmulticobex.so.1 \
libobexftp.so.0 \
obexftp"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbluetooth.so.3 \
libc.so.6 \
libopenobex.so.2"

inherit rpm
