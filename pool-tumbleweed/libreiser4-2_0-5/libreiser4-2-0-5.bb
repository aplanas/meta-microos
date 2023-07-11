SUMMARY = "Reiser4 filesystem library"
DESCRIPTION = "Reiser4 support library implementing the main filesystem logic for \
the reiser4progs utilities."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "libreiser4-2_0-5-2.0.5-1.8.aarch64.rpm"
RPM_HASH = "2c9ad5e170bf3613fc676e9738dbbe0fc2ca66fe2f2f530b6e46efef44496eeee7d8f2acc3c0e5a00ff6b69660be7d0e4ac1eb182644c02b525a9b4e1a23e504"

RPROVIDES:${PN} += "libreiser4-2-0-5 \
libreiser4-2.0.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreadline.so.8 \
libuuid.so.1"

inherit rpm
