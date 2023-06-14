SUMMARY = "FreeWnn Chinese Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libcwnn0-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "3a85630360427fdf839ee1036a0775703881b9b7ce755296b5d9a481ea08871ae439dda5ee6d879aef114ab232855afef48bfb50de38f1c303b51757a93c3fe9"

RPROVIDES:${PN} += "libcwnn.so.0 \
libcwnn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
