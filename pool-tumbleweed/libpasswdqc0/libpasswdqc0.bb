SUMMARY = "A Simple Password Strength Checking Library"
DESCRIPTION = "libpasswdqc is a simple password strength checking library. \
In addition to checking regular passwords, it offers support for passphrases \
and can provide randomly generated ones."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libpasswdqc0-1.4.0-2.8.aarch64.rpm"
RPM_HASH = "3da931df549248909b30c0effeea5a0fa3c36b63e7eee8bddc05ea002f585ee2d958f9f2aa8c1736e4d603ff33aefc1c3ca4ce6ebf51451d96284c82d8f39eb2"

RPROVIDES:${PN} += "libpasswdqc.so.0 \
libpasswdqc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
