SUMMARY = "Data manipulation toolbox similar to R data.frame"
DESCRIPTION = "Data manipulation toolbox similar to R data.frame. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.2.0"

RPM_NAME = "octave-forge-dataframe-1.2.0-1.19.noarch.rpm"
RPM_HASH = "80630e58a8f6e9f78490f36c8597b1503ed7d638d63ff07c4659a9c56ffe58938a7870b2e3d6dc0348e85e51136d9298a26b2bbb7604b40cd502a124ee8501dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-dataframe"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
