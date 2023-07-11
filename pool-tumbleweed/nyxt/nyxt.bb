SUMMARY = "Keyboard-oriented, Common Lisp extensible web-browser"
DESCRIPTION = "Nyxt is a keyboard-oriented, extensible web-browser designed for power users. \
It has familiar key-bindings (Emacs, VI, CUA), is fully configurable and \
extensible in Lisp, and has powerful features for productive professionals."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "nyxt-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "be24bdd9c6f72aaa0a0cdcdf5b1b20a4dca2b919543352d7a7f462d7b8b5aa0843eb45557a3ea3b364fb7a81e5550f230814ad702f597c74c3ce5a3da87d9f47"

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
