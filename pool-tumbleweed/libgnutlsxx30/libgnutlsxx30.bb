SUMMARY = "C++ API for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutlsxx30-3.8.0-4.2.aarch64.rpm"
RPM_HASH = "c87b48bf2dafbb338ec9368d3d4dacbcd8b69b4a28f15ab468a0c34a3e53f7ae76733e5168ca42269774349a98ac2118825bd0c178f8a994f010fa1ffaa5d588"

RPROVIDES:${PN} += "libgnutlsxx.so.30 \
libgnutlsxx30"

RDEPENDS:${PN} += "/sbin/ldconfig \
crypto-policies \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libstdc++.so.6"

inherit rpm
