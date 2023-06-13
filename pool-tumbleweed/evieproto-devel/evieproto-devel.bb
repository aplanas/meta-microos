SUMMARY = "The X11 Protocol: Event Interception extension"
DESCRIPTION = "The Evie protocol headers for X11 development. \
XEvIE is a X extension providing functionalities to allow a client to \
intercept keyboard/mouse events, and optionally modify them or consume \
them before delivery through the normal event delivery mechanisms. \
 \
It was included in X11R6.8 through Xorg server 1.5, but is no \
longer supported in current X server releases."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "evieproto-devel-1.1.1-4.19.aarch64.rpm"
RPM_HASH = "cd5eacf092a2a5a630931c74aa6b5d936091584f9456bfd285444b68a5ec716cecb8565795ad04d48e947320c8addfcfe81e98cacd6e315ee5b6bd6c822324f8"

RPROVIDES:${PN} += "evieproto-devel \
evieproto-devel(aarch-64) \
pkgconfig(evieproto) \
xorg-x11-proto-devel:/usr/lib64/pkgconfig/evieproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
