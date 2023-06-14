SUMMARY = "C++ API for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutlsxx30-3.8.0-4.1.aarch64.rpm"
RPM_HASH = "f985e7019ded011ebc0166457499ab407a2e4c850ea46998fc8d8d62fec76f009664e96ca383eaa94a0287937f06a3ddfa65164e1776a21605aa7092f452492e"

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
