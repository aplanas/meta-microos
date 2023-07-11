SUMMARY = "OpenPGP implementation as a C++ library fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG. \
librnp is the library used by RNP for all OpenPGP functions, useful for \
developers to build against, different from GPGME."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "librnp0-0.17.0-4.1.aarch64.rpm"
RPM_HASH = "98db488af629d04205a4b0d840ab7d790475f9fe6fd039d1b41fe586ba8023e84a6fc6d12bb48de42662febf5e88ea6b121ac13d7f0ffa745910b4bfa8ca75ad"

RPROVIDES:${PN} += "librnp.so.0 \
librnp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbotan-2.so.19 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
libsexpp.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
