SUMMARY = "Multivariate normal distribution clustering and utility functions for Octave"
DESCRIPTION = "Multivariate normal distribution clustering and utility functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.1.0"

RPM_NAME = "octave-forge-mvn-1.1.0-1.22.noarch.rpm"
RPM_HASH = "92803af69684106fdc0e2dcf45a287a7739c648279265c7a1cf1c5a2e7279d40adfec850652139fc692182555e81759d6fe5aae85a20c66fbd4e64e1cf92a6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-mvn"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
