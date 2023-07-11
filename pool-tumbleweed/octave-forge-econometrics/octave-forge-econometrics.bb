SUMMARY = "Econometrics functions including MLE and GMM based techniques for Octave"
DESCRIPTION = "Econometrics functions including MLE and GMM based techniques. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "octave-forge-econometrics-1.1.2-1.16.aarch64.rpm"
RPM_HASH = "d61a45bfeecaa4ff318b358f2f4f793c3a84f30ed4af43e53c911411f328b498f3124fe2e7d67e8764117444d0b9afd95351ef6d1835b55ea4b30936f50b781e"

RPROVIDES:${PN} += "octave-forge-econometrics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli \
octave-forge-optim"

inherit rpm
