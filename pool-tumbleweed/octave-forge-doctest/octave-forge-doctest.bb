SUMMARY = "Octave-Forge documentation tests"
DESCRIPTION = "The Octave-Forge Doctest package finds specially-formatted blocks of example \
code within documentation files. It then executes the code and confirms \
the output is correct. This can be useful as part of a testing framework \
or simply to ensure that documentation stays up-to-date during software development. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "0.8.0"

RPM_NAME = "octave-forge-doctest-0.8.0-1.3.noarch.rpm"
RPM_HASH = "d37b898b7142425f9de4173dbfe8fd3e08375906d5ef3f49bee14e6ea89d537bd774ade10b0d31be346ef7117fee1b9ccec81d4b860f28f9c707e27d3a5dc8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-doctest"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
