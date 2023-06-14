SUMMARY = "Library for Portable Symmetric Key Container"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
For managing secret key files, the Portable Symmetric Key Container \
(PSKC) format described in RFC6030 is supported."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "libpskc0-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "5f2b9e0868f21674425d99ae561f32930fa35e3610ae4291023419ea62a818c376c935a175fcad1edaf6ad745f5202eb804c5d0964d88656515e1f794a1694d3"

RPROVIDES:${PN} += "libpskc.so.0 \
libpskc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1"

inherit rpm
