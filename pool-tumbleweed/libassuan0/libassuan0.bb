SUMMARY = "IPC library used by GnuPG version 2"
DESCRIPTION = "Libassuan is the IPC library used by gpg2 (GnuPG version 2)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.5.6"

RPM_NAME = "libassuan0-2.5.6-1.1.aarch64.rpm"
RPM_HASH = "10dfd0a5c20cdad02fe781c9ebf47e66e25696ffc8f979033556462ce3a4202bee716ba201984a03d51c5cb40667cf4418dfbfb1ac1e9f28bda9b1038855a259"

RPROVIDES:${PN} += "libassuan.so.0 \
libassuan0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
