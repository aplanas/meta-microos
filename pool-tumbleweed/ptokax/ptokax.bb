SUMMARY = "Server application for the Neo-Modus DC++ sharing network"
DESCRIPTION = "PtokaX Direct Connect Hub is a server application for Neo-Modus \
Direct Connect Peer-To-Peer sharing network. \
 \
PtokaX has a comprehensive user interface, tuned built-in features, \
scripting-based extendability."
LICENSE = "GPL-3.0-only"

PV = "0.5.3"

RPM_NAME = "ptokax-0.5.3-1.1.aarch64.rpm"
RPM_HASH = "d2554574bbd5a5a55ade906481474adec292d084c01af583d53b294e17bbe943c7f9a6d65a2e1c0fac32c4eb3c1b9f9072e457b2efb3eddbfee69643e317627c"

RPROVIDES:${PN} += "config-ptokax \
ptokax"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0 \
libz.so.1 \
shadow"

inherit rpm
