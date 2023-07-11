SUMMARY = "A library to deshake video"
DESCRIPTION = "A library to deshake videos, designed to stabilize even strongly jiggled clips."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "libvidstab1_1-1.1.0-2.20.aarch64.rpm"
RPM_HASH = "e8175d198400501298bdbf34bd9b190b45d8535a20f1980595076a0ed5980eb0ac6e7498283cb2b611bc134e82ad0aa2d1bde8e6c7608a1d0ffbcf7fe6529a35"

RPROVIDES:${PN} += "libvidstab.so.1.1 \
libvidstab1-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
