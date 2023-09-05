SUMMARY = "Keyboard-oriented, Common Lisp extensible web-browser"
DESCRIPTION = "Nyxt is a keyboard-oriented, extensible web-browser designed for power users. \
It has familiar key-bindings (Emacs, VI, CUA), is fully configurable and \
extensible in Lisp, and has powerful features for productive professionals."
LICENSE = "BSD-3-Clause"

PV = "3.6.1"

RPM_NAME = "nyxt-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "0588da85260ea9312c048022f589a678038a495554d2e56bcc250df95922e097101deafa23d03e3fdc544f7fef3175e8e48613e0ef86ed980c19494b9fff3799"

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
