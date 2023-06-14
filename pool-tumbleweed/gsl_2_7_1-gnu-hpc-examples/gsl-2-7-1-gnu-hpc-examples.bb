SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl_2_7_1-gnu-hpc-examples-2.7.1-1.3.noarch.rpm"
RPM_HASH = "908e33d6199f3b127c9fd6d4dc43b932ce4ee7ef517d615fde403e4f5a3a9c75b7e845063e00ffdeba188712475e5bc70641ea4245512248703cd89791d0f20e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-2-7-1-gnu-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
