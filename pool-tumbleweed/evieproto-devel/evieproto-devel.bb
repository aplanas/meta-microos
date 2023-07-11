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

RPM_NAME = "evieproto-devel-1.1.1-4.20.aarch64.rpm"
RPM_HASH = "0e677d015567dd64446c7a23b91b3b0cf1f573149ae4a381dc70932106c00fed484eb711a4a37b57c3b1142bbcd7a335913604d4432bbdede207a1713833d1d6"

RPROVIDES:${PN} += "evieproto-devel \
pkgconfig-evieproto \
xorg-x11-proto-devel-/usr/lib64/pkgconfig/evieproto.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
