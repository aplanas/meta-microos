SUMMARY = "Additional manipulation functions for Octave"
DESCRIPTION = "Additional manipulation functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "octave-forge-strings-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "57eb408406df1aa08d214c51c29dcb7cb251083caa88909a22d1014db2f98a7268e7a818b22514025b406093910d3ed4783a1ad56f54417e813da313fe6c3cfb"

RPROVIDES:${PN} += "octave-forge-strings \
octave-forge-strings(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm
