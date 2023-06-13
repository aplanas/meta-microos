SUMMARY = "N-dimensional variational analysis for Octave"
DESCRIPTION = "divand performs an n-dimensional variational analysis (interpolation) \
of arbitrarily located observations. \
This is part of Octave-Forge project."
LICENSE = "GPL-2.0+"

PV = "1.1.2"

RPM_NAME = "octave-forge-divand-1.1.2-1.22.noarch.rpm"
RPM_HASH = "6d21efd54e8ba49682527cef14c45c09ae42c485f115431b61fa693dbf8d3408ebdfebbc7899748ce484486f9d3de62d391088731f70bd8b738a11d4a52c2abc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-divand"

RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
