SUMMARY = "Open Source Implementation of the Object Exchange (OBEX) Protocol"
DESCRIPTION = "OBEX is a session protocol and can best be described as a binary HTTP \
protocol. OBEX is optimized for ad-hoc wireless links and can be used \
to exchange all kind of objects, like files, pictures, calendar entries \
(vCal), and business cards (vCard)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libopenobex2-1.7.2-3.4.aarch64.rpm"
RPM_HASH = "d46475d8cdc39e4cf9986eb3ef1e559ffeae836ece7a9671418e7e9ed0b689a43db086c4427ebef5a1ce3781b7848f97a34f1d076efb4dc20fa1e03247d75107"

RPROVIDES:${PN} += "libopenobex.so.2()(64bit) \
libopenobex2 \
libopenobex2(aarch-64) \
openobex"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
