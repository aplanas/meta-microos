SUMMARY = "FreeWnn Japanese Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libjd0-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "f353fe7c92c0c8a6db31f03f307858c72d93226950d50f69315f6805c9ff7907ff26e5acaa1b527a25722cfdd8b1c5b443985cbf442174df45ec4d4e04d4805c"

RPROVIDES:${PN} += "libjd.so.0 \
libjd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
