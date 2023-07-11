SUMMARY = "Cryptographic Tools"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
This package contains a few command-line tools to perform cryptographic \
operations using the nettle library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "nettle-3.9.1-2.1.aarch64.rpm"
RPM_HASH = "11a0db56af3c2460eb3ecbbb260593dca845fc335bbfb6108d4819658a605848f45621e5c5510ac6c4e5029cb9e867241133e804fef02dd56ffe8bdde1e74b13"

RPROVIDES:${PN} += "nettle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
