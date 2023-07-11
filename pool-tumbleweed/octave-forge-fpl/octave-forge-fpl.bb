SUMMARY = "Fem PLotting for Octave"
DESCRIPTION = "Collection of routines to export data produced by Finite Elements or Finite \
Volume Simulations in formats used by some visualization programs. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0+"

PV = "1.3.5"

RPM_NAME = "octave-forge-fpl-1.3.5-1.23.noarch.rpm"
RPM_HASH = "0d4651cd88af73d24c2648e21d8a367ff81e82b1624ab80298fb8eccc6023ac5726de1422d77a4fe8b557ff4ace3d5b7066d78e28343a6511930c1355acb7e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-fpl"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
