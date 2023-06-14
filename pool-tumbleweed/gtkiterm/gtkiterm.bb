SUMMARY = "Internationalized Terminal Emulator for GTK"
DESCRIPTION = "An internationalized terminal emulator for GTK."
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "gtkiterm-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "0631b051afc003f31c1695972037e046c02cc51cf763034e01c9182b8bb52faa79481204a7b34739d6cd11bbe521f9396735e8393cf33983ae66ce4aa6b437a4"

RPROVIDES:${PN} += "gtkiterm \
locale-gtk2-ja;ko;zh"

RDEPENDS:${PN} += "group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libiterm.so.1 \
libpango-1.0.so.0"

inherit rpm
