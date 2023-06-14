SUMMARY = "Caja shared libraries"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libcaja-extension1-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "ac0e2c111de2420409de31dc4345a57ffd6847be359d5b231c30f7d62384f9b4be9b0dbe4ab02dace0e5c70b6f4b8053e3d3c60829f7f50ab822fe2a38794e4a"

RPROVIDES:${PN} += "libcaja-extension.so.1 \
libcaja-extension1"

RDEPENDS:${PN} += "/sbin/ldconfig \
caja-gschemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
