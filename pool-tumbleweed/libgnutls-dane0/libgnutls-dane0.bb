SUMMARY = "DANE support for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS project aims to develop a library that provides a secure \
layer over a reliable transport layer. \
This package contains the 'DANE' part of gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutls-dane0-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "9b630d7c17c51c9afedd83d771df83d98ebecf2059308d2727b4b1edd637dd6ddbc08ac264a55ab1e45f87beb26133da56a41fc564761352be43e633e41cd008"

RPROVIDES:${PN} += "libgnutls-dane.so.0 \
libgnutls-dane0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libunbound.so.8"

inherit rpm
