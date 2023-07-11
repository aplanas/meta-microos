SUMMARY = "More miscellaneous utility routines for X"
DESCRIPTION = "The Xmu/Xmuu libraries are a collection of miscellaneous (some might \
say random) utility functions that have been useful in building \
various applications and widgets."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXmuu1-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "f50939b4c3f2ce7cc988c2f9f8b8db2e7f354b75eba543fcce6598c3aa9bd8b9b041c60363bf5a95cf984f31300ed3d1ff7e9521bcf04ed5d28490734d52a769"

RPROVIDES:${PN} += "libXmuu.so.1 \
libXmuu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
