SUMMARY = "GNU Chess Program"
DESCRIPTION = "A worthy chess opponent that runs in text mode. Find an X11 interface \
in the xboard package."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.9"

RPM_NAME = "gnuchess-6.2.9-2.7.aarch64.rpm"
RPM_HASH = "bd9eebce61eb0bd9e722af02862a910851e02ff441e069c7f01197c257569dfa9a0c3e2e5434801f448aeec7deb4fa4aeced2c2f286551bb135ff2c8b6860918"

RPROVIDES:${PN} += "chess_backend \
gchess \
gnuchess \
gnuchess(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
