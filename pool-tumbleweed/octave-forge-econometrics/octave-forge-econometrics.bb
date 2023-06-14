SUMMARY = "Econometrics functions including MLE and GMM based techniques for Octave"
DESCRIPTION = "Econometrics functions including MLE and GMM based techniques. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "octave-forge-econometrics-1.1.2-1.15.aarch64.rpm"
RPM_HASH = "5dfcf61dda53e8490e79167f6dba62e83ffb1793be5df6f66e16139d858485a54961cb4f5221fa5da3d056cd8cf75e971a8611d22724ccc6131b826e1f696713"

RPROVIDES:${PN} += "octave-forge-econometrics"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli \
octave-forge-optim"

inherit rpm
