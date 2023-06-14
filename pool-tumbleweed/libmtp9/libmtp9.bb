SUMMARY = "Library for accessing MTP Players"
DESCRIPTION = "This package contains the libraries that allow access to USB based media \
players based on the MTP (Media Transfer Protocol) authored by \
Microsoft. \
 \
Common devices using this technology are Creative Zen, iRiver, Samsung \
and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.21"

RPM_NAME = "libmtp9-1.1.21-1.1.aarch64.rpm"
RPM_HASH = "03ab5e35789fb490a46489d0c1fb0a08634d582ce8360417474817ccf732754dc0de50f81ad65a43fa1f02fe7fde8b782837241037eb70f49a173391b8d856a0"

RPROVIDES:${PN} += "libmtp.so.9 \
libmtp9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libmtp-udev \
libusb-1.0.so.0"

inherit rpm
