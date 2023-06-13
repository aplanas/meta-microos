SUMMARY = "Cryptographic Tools"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
This package contains a few command-line tools to perform cryptographic \
operations using the nettle library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.9"

RPM_NAME = "nettle-3.9-1.1.aarch64.rpm"
RPM_HASH = "4c2d6d399e51719b6ad81363050a173706a6fee5d069a02b843d6011de4939daf3856538b4e4457cf9bc0aac2feaca989d40a1d13ad8e81289fc304ae4cde5cb"

RPROVIDES:${PN} += "nettle \
nettle(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
