SUMMARY = "A daemon to control radio killswitches"
DESCRIPTION = "Urfkill is a daemon to control radio killswitches through /dev/rfkill \
and supports PolicyKit authorization mechanism."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "urfkill-0.5.0-3.6.aarch64.rpm"
RPM_HASH = "037478faf6fa92310d142ce60d38772741187e8e8a4182a1550cbe8ab8cf4ef007c2ec3c07e0fd6b2d0d9e2e64fb89532af6ad65aa7c056f5a547820e771cb05"

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
