SUMMARY = "Programmatic C++ library interface to GnuPG"
DESCRIPTION = "GnuPG Made Easy (GPGME) is a library designed to make access to GnuPG \
easier for applications. It provides a high-level crypto API for \
encryption, decryption, signing, signature verification, and key \
management. \
 \
This package contains the C++ bindings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.21.0"

RPM_NAME = "libgpgmepp6-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "4febb12dcffd53ac26096022cd38bc9eb7fb5f56e84f89a976a2378b83d7900e175b1fc12bd683ad64400d6b9a79edf6c1f6df0920f5918bc63f62f11bb4e386"

RPROVIDES:${PN} += "libgpgmepp.so.6 \
libgpgmepp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgpgme.so.11 \
libstdc++.so.6"

inherit rpm
