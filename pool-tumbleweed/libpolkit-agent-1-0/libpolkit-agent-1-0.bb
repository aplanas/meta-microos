SUMMARY = "PolicyKit Authorization Framework -- Agent Library"
DESCRIPTION = "PolicyKit is a toolkit for defining and handling authorizations. \
It is used for allowing unprivileged processes to speak to privileged \
processes. \
 \
This package contains the agent library only."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "libpolkit-agent-1-0-121-4.2.aarch64.rpm"
RPM_HASH = "ff0c7e22b137d7fb52f4094e341b222ab9580afaea4a26598f260b3dfef69d530da8a7810765f80dabddcb10d99b70cf9d343f7ebc89bb0f98a6edf7e1e3a96e"

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
