SUMMARY = "Algorithms for smoothing noisy data"
DESCRIPTION = "Algorithms for smoothing noisy data. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.3.0"

RPM_NAME = "octave-forge-data-smoothing-1.3.0-1.23.noarch.rpm"
RPM_HASH = "e01a766f049fbfd86d4255726f30086ba72ce8f67e476fefcea2369196a713472e61cafee7dd5d97c54fe2b78ee6e7a3fa48e1eb0fe6744667b36ba3c57617ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-data-smoothing"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-optim"

inherit rpm
