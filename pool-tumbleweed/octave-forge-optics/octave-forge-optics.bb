SUMMARY = "Functions covering various aspects of optics for Octave"
DESCRIPTION = "Functions covering various aspects of optics. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-optics-0.1.4-1.13.noarch.rpm"
RPM_HASH = "99647a2bf3e7d17ea1d56bcf672443827deefa000e7edfd5d551f3c5ae5c9988cbea8f378a6e7eb59323bb34892d68e46e8781a9fb1a4ea81a40c4c4674d0e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-optics"

RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
