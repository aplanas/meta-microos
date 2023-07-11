SUMMARY = "Cryptographic Library for Public Key Algorithms"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
The libhogweed library contains public key algorithms to use with libnettle."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "libhogweed6-3.9.1-2.1.aarch64.rpm"
RPM_HASH = "e5fd54b005eeba6b2079b27194e6190a5449370c2ab959af033c17864efae3a5e590ad50a061ba77ee6e75c96839674350e097c815bb53e7822a477f8ff16f36"

RPROVIDES:${PN} += "libhogweed.so.6 \
libhogweed6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libnettle.so.8"

inherit rpm
