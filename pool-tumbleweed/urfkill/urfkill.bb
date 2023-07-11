SUMMARY = "A daemon to control radio killswitches"
DESCRIPTION = "Urfkill is a daemon to control radio killswitches through /dev/rfkill \
and supports PolicyKit authorization mechanism."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "urfkill-0.5.0-3.7.aarch64.rpm"
RPM_HASH = "a4ba425a9a13259f6b19c3b745b791c8c1deb07989150427516bd97c08d64f7bce55d0c0fe5400275b32184771a464e8e41a159696a1c23fa760b8b438c3c495"

RPROVIDES:${PN} += "config-urfkill \
urfkill"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
libudev.so.1 \
polkit"

inherit rpm
