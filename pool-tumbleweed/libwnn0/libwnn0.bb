SUMMARY = "FreeWnn Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libwnn0-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "dcdc3aa10b5b2f4ebb3ef353f7f305cd90e24c83d6236d864b35c4dbf97f296dd7ea3575398938afb17d00f5b89ff9a7a5d0624f5f92aacf3b3f4c721309a63b"

RPROVIDES:${PN} += "libwnn.so.0 \
libwnn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
