SUMMARY = "Caja shared libraries"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libcaja-extension1-1.26.1-1.5.aarch64.rpm"
RPM_HASH = "bde177d1147a2298b4730f2bf9d17a0a7a250ac2944d7128cf80a78b46d487adeed9a6911104476227b079e3e66347d64d79ba52d364963b13bf50e2ffada2ce"

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
