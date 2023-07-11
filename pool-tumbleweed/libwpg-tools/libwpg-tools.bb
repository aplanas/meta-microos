SUMMARY = "Tools for converting WordPerfect Graphics files"
DESCRIPTION = "Tools to work with graphics in WPG (WordPerfect Graphics) format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-tools-0.3.4-2.2.aarch64.rpm"
RPM_HASH = "621b0bbccf507ac7863c4dd0d03bc8c15d917d11c981a47c70e78ed6371e481ae25466c1969134595c82643484f6a47194fdd853a2f1f369801465f7a67e07e1"

RPROVIDES:${PN} += "libwpg-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstdc++.so.6 \
libwpg-0.3.so.3"

inherit rpm
