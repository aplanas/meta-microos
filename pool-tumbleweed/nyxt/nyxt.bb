SUMMARY = "Keyboard-oriented, Common Lisp extensible web-browser"
DESCRIPTION = "Nyxt is a keyboard-oriented, extensible web-browser designed for power users. \
It has familiar key-bindings (Emacs, VI, CUA), is fully configurable and \
extensible in Lisp, and has powerful features for productive professionals."
LICENSE = "BSD-3-Clause"

PV = "3.4.0"

RPM_NAME = "nyxt-3.4.0-1.1.aarch64.rpm"
RPM_HASH = "0951df53dcfd91d8eed818f167241d227491f6de44410566b9468f4d0c7dc207e0b3027e8889f8cd17de9d10fdeeb6806159ba00e99a2924556972fb40acb1e6"

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
