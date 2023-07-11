SUMMARY = "Yet Another Screen Library (lib(n)curses alternative)"
DESCRIPTION = "yascreen is a lib(n)curses alternative, oriented towards modern terminals."
LICENSE = "LGPL-3.0-or-later"

PV = "1.97"

RPM_NAME = "libyascreen0-1.97-1.4.aarch64.rpm"
RPM_HASH = "207bab66c8e5040751658af64a0c0a339a152f9be543b46d71a176dd0a0064fee27c3babbdc83ec87ec7e460131120c8077b098aaa79da5a442d4ee26a5ccf2c"

RPROVIDES:${PN} += "libyascreen.so.0 \
libyascreen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
