SUMMARY = "Non-linear optimization toolkit for Octave"
DESCRIPTION = "Non-linear optimization toolkit. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "octave-forge-optim-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "dd11c66c1893baeacde1dd067975b537cd53dc1c9fc4cccce98361f6d03a152b4a86ee57d4aa1304cef2822f5df92163f6e091b41217d8aa2fa333f64cbfd1dd"

RPROVIDES:${PN} += "octave-forge-optim"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-cli \
octave-forge-parallel \
octave-forge-statistics \
octave-forge-struct"

inherit rpm
