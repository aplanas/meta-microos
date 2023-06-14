SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libblkid1-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "b4ece04bffcfe987c4a994b7bde60e533756d6445ce5af3942a84fb873de31d5e2c00b11cef4e0724122dd38fe36e2f9e26a27eb3cd69c34487248e20921f153"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
