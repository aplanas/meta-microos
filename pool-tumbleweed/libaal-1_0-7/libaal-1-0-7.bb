SUMMARY = "Application abstraction mechanism library used by reiser4progs"
DESCRIPTION = "libaal includes device abstraction, libc independence code, and more."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "libaal-1_0-7-1.0.7-2.13.aarch64.rpm"
RPM_HASH = "1c8208e9a76c6e8c27bc6c9f0f7146ce9bd386916b67bb284f2efc33c45fb606b1b9db3d6fbc592c21718e49207b44e8cb9c447ef8b67387f0d482f621cc8d09"

RPROVIDES:${PN} += "libaal-1-0-7 \
libaal-1.0.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
