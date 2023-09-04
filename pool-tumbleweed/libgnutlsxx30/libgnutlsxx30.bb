SUMMARY = "C++ API for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libgnutlsxx30-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "b88bcb6211473e92b930959c872ba1f340f0f576a96d7ae8c54ff8ef94b3a5c1380a2fe6a13feb957d7bb1f4556d70615bbcd44f1cd0e9e23f397b397b209fb3"

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
