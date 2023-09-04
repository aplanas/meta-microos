SUMMARY = "Keyboard-oriented, Common Lisp extensible web-browser"
DESCRIPTION = "Nyxt is a keyboard-oriented, extensible web-browser designed for power users. \
It has familiar key-bindings (Emacs, VI, CUA), is fully configurable and \
extensible in Lisp, and has powerful features for productive professionals."
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "nyxt-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "1a50af3965ae9df04b79c2aa148f56cb157c824fce4d9dc5ef9af0ed8f1a19fabb6b0a601fcc52f4f41386595db4d01bdae8922d71920041d20cce80c46dcf6b"

RPROVIDES:${PN} += "nyxt"

RDEPENDS:${PN} += "enchant-tools \
glib-networking \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libzstd.so.1 \
xclip"

inherit rpm
