SUMMARY = "PolicyKit Authorization Framework -- Agent Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the agent library only."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "libpolkit-agent-1-0-121-4.3.aarch64.rpm"
RPM_HASH = "03ef4997af9378398196cc0d518f9c13c96ec016244527eef75309df05da796161f29d988f5cb908cd23c5977720d52e4a1598c3c5b97a6141d1527f917ca451"

RPROVIDES:${PN} += "libpolkit-agent-1-0 \
libpolkit-agent-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
polkit"

inherit rpm
