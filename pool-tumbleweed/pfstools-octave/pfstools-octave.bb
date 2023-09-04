SUMMARY = "Octave interaction with PFS tools"
DESCRIPTION = "The pfstools-octave package contains programs to process RGB \
or luminance channels in PFS streams using Octave."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-octave-2.2.0-3.16.aarch64.rpm"
RPM_HASH = "44f144d1451ed8735fd898e7cd12f2138e5b39e965ae82005c153f49fcc8d16e4bc290d9fcbf45da139da6ace118f7eb542580e7a211849b918b0852c81d0862"

RPROVIDES:${PN} += "pfstools-octave"

RDEPENDS:${PN} += "/usr/bin/octave \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpfs.so.2 \
libstdc++.so.6 \
octave"

inherit rpm
