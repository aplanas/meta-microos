SUMMARY = "Yet Another Screen Library (lib(n)curses alternative)"
DESCRIPTION = "yascreen is a lib(n)curses alternative, oriented towards modern terminals."
LICENSE = "LGPL-3.0-or-later"

PV = "1.97"

RPM_NAME = "libyascreen0-1.97-1.3.aarch64.rpm"
RPM_HASH = "9395a1191bc333e51e00d941dfc553ee274578bc43f50f22a4d19cbf7e71b91215e0a768d0a5bff45336ff89b4d63876ed7e19984bec96b21d71038e9f7cd151"

RPROVIDES:${PN} += "libyascreen.so.0 \
libyascreen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
