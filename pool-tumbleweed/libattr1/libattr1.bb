SUMMARY = "A dynamic library for filesystem extended attribute support"
DESCRIPTION = "This package contains the libattr.so dynamic library, which contains \
the extended attribute library functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.1"

RPM_NAME = "libattr1-2.5.1-1.21.aarch64.rpm"
RPM_HASH = "f7b184631f5ccc3c41a3266a7cab8c96567b4f2d36e17ebb899e6b36235fe2a81662919ba3b951e3174c4cced83b78da9087df4c6f39108d25f4c7e2d6f8cb08"

RPROVIDES:${PN} += "config-libattr1 \
libattr \
libattr.so.1 \
libattr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
