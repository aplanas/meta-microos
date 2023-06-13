SUMMARY = "Time Series Analysis Toolbox for Octave"
DESCRIPTION = "Stochastic concepts and maximum entropy methods for time series analysis. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.6.3"

RPM_NAME = "octave-forge-tsa-4.6.3-1.7.noarch.rpm"
RPM_HASH = "d13381dbe2a49dd63d033b3ca51d337804eb31ea67d978a98eacd649fb8bac30c65fa07bf772dabe93c4ec9367b918fb315009051e0b5897ddb7ef3033e7db38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-tsa"

RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-nan"

inherit rpm
