SUMMARY = "Octave interaction with PFS tools"
DESCRIPTION = "The pfstools-octave package contains programs to process RGB \
or luminance channels in PFS streams using Octave."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-octave-2.2.0-3.15.aarch64.rpm"
RPM_HASH = "8ba2711193b67907848a53088840acd9b9579c69d9fce45ce1abf8601274b3245b4d061ec742b1e5b0dc789dbf2dcdf4c440d9d322547f339183d10473de6557"

RPROVIDES:${PN} += "pfstools-octave"

RDEPENDS:${PN} += "/usr/bin/octave \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6 \
octave"

inherit rpm
