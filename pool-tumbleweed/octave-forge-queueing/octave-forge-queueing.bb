SUMMARY = "Queueing Networks and Markov chains analysis for Octave"
DESCRIPTION = "Functions for queueing networks and Markov chains analysis. \
This package can be used to compute steady-state performance measures \
for open, closed and mixed networks with single or multiple job classes. \
Mean Value Analysis (MVA), convolution, and various bounding techniques are \
implemented. Furthermore, several transient and steady-state performance \
measures for Markov chains can be computed, such as state occupancy \
probabilities, mean time to absorption, time-averaged sojourn times \
and so forth. Discrete- and continuous-time Markov chains are supported. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "octave-forge-queueing-1.2.7-1.12.noarch.rpm"
RPM_HASH = "28c1d66a30fdbee55f253da0466d57bdcaac69e67fcc1ea683f17354c8601e6b907041302d3ac57897d65e33e48572114174023a7d059839a171d516222a58d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-queueing"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli"

inherit rpm
