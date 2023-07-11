SUMMARY = "Additional spline functions for Octave"
DESCRIPTION = "Additional spline functions. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.3.4"

RPM_NAME = "octave-forge-splines-1.3.4-1.10.noarch.rpm"
RPM_HASH = "7678fed34e19c77608a946ea509e0495fd11c49133970fe14f0f24a00b29d48915ae8ae1e51d3904d96210a6f9ccf741be08b6b1b2e7e12b4957a923c738757c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-splines"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
