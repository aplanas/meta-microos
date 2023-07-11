SUMMARY = "C API of libconfig"
DESCRIPTION = "libconfig is a library for manipulating structured configuration \
files. The supported file format is more compact and more readable \
than XML. Unlike XML, it is type-aware, so it is not necessary to do \
string parsing in application code. \
 \
This package contains the shared libraries for libconfig."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.3"

RPM_NAME = "libconfig11-1.7.3-1.9.aarch64.rpm"
RPM_HASH = "5405a3c5598b586958ed7e75d941e2b4e5aa1b217e8cbee8f50205720c197619a00eecec0f24c325466f91d0329a4bf95e6308df263d614fc1b3b3377700cc89"

RPROVIDES:${PN} += "libconfig.so.11 \
libconfig11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
