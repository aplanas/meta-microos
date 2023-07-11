SUMMARY = "Additional Structure manipulations functions for Octave"
DESCRIPTION = "Additional Structure manipulations functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.18"

RPM_NAME = "octave-forge-struct-1.0.18-1.7.aarch64.rpm"
RPM_HASH = "40886699e00bdbf679723655dfa5f0d3cc37c89e1f93c8fe76f534c5bc83fc210f869f1ac30eb708c3979ee536785f9a04060c2152fcc863e56505ae203a18f7"

RPROVIDES:${PN} += "octave-forge-struct"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli"

inherit rpm
