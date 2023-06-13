SUMMARY = "Octave clipping polygons tool"
DESCRIPTION = "This package allows to do boolean operations with polygons using \
the Greiner-Hormann algorithm. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "octave-forge-octclip-2.0.3-1.3.aarch64.rpm"
RPM_HASH = "dc57fe655028665d5078d50f1ff0d5071abf250cecb3177005162655d28f22fb7a0696dbadf53a072d0ac3253e5ab27be26b4cca951c3eb19765d466a902376a"

RPROVIDES:${PN} += "octave-forge-octclip \
octave-forge-octclip(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm
