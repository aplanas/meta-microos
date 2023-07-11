SUMMARY = "Functions covering various aspects of optics for Octave"
DESCRIPTION = "Functions covering various aspects of optics. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-optics-0.1.4-1.14.noarch.rpm"
RPM_HASH = "81d2d38aa767c248bd344db7d38d20227fb06f46898631bf327ad962a593e07b298cf0b8754c50d164369c3718967917071a01aa4e65e0c4650e0c92b4d94308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-optics"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
