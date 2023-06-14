SUMMARY = "Jigdo Template Export Library"
DESCRIPTION = "libjte is a library providing support for creating jigdo files, to be used by \
ISO image creation tools."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22"

RPM_NAME = "libjte2-1.22-1.10.aarch64.rpm"
RPM_HASH = "e3ce270a936dd5080259fcea73ba36c300b6e3a3b6ae87db57e9f447e6ccf7bc424130052911f484d4a4c89980dd270132f23e37f89fcfe3383f41ed81164976"

RPROVIDES:${PN} += "libjte.so.2 \
libjte2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
