SUMMARY = "Octave clipping polygons tool"
DESCRIPTION = "This package allows to do boolean operations with polygons using \
the Greiner-Hormann algorithm. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "octave-forge-octclip-2.0.3-1.3.aarch64.rpm"
RPM_HASH = "dc57fe655028665d5078d50f1ff0d5071abf250cecb3177005162655d28f22fb7a0696dbadf53a072d0ac3253e5ab27be26b4cca951c3eb19765d466a902376a"

RPROVIDES:${PN} += "octave-forge-octclip"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
