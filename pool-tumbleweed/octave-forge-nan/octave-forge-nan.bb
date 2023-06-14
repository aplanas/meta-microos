SUMMARY = "A statistics and machine learning toolbox"
DESCRIPTION = "A statistics and machine learning toolbox for data with and w/o missing values. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "octave-forge-nan-3.7.0-1.6.aarch64.rpm"
RPM_HASH = "f06af684d463c047cf9de715fc205a6d45fe385cb6dbf0d00580e98fa27287066ed24908ac2b94bf86f8ecc131dcdf9bd0fbde36929e29c7d444539f98af917b"

RPROVIDES:${PN} += "octave-forge-nan"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-cli"

inherit rpm
