SUMMARY = "Keyboard-oriented, Common Lisp extensible web-browser"
DESCRIPTION = "Nyxt is a keyboard-oriented, extensible web-browser designed for power users. \
It has familiar key-bindings (Emacs, VI, CUA), is fully configurable and \
extensible in Lisp, and has powerful features for productive professionals."
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "nyxt-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "a462f338219310c5844fdb2b3a0dffb4182a143ec0f89e3d882fe29b10e7f0a3d1ada79148f0afe19960763f8d0cc7e2b5185a036e87bc1067ec5c42e71b22d2"

RPROVIDES:${PN} += "nyxt"

RDEPENDS:${PN} += "enchant-tools \
glib-networking \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfixposix4 \
libm.so.6 \
libwebkit2gtk-4-1-0 \
libzstd.so.1 \
xclip"

inherit rpm
