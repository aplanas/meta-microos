SUMMARY = "PolicyKit Authorization Framework -- GObject Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the gobject library only."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "libpolkit-gobject-1-0-121-4.3.aarch64.rpm"
RPM_HASH = "970ac63ad22d473afc1a91334b1641f816ac79aa0a38651b5c1bb09e84f10a96175701839a7ff948593f471fd3c62912934f90d500029b4c15ffe66f50efcebc"

RPROVIDES:${PN} += "libpolkit-gobject-1-0 \
libpolkit-gobject-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0 \
polkit"

inherit rpm
