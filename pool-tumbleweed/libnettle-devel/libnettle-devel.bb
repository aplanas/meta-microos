SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "libnettle-devel-3.9.1-2.1.aarch64.rpm"
RPM_HASH = "abfc174949a0684d1f008d7f3556864b44eee6024682fe16c8ac8966b18e5ea89ca3b342dfff815692e12b7b8fe320013b9c89365834bad9722e972fd9c05335"

RPROVIDES:${PN} += "libnettle-devel \
pkgconfig-hogweed \
pkgconfig-nettle"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
gmp-devel \
libhogweed6 \
libnettle8 \
pkgconfig-nettle"

inherit rpm
