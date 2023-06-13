SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.3"

RPM_NAME = "python39-scikit-sound-0.2.3-3.11.noarch.rpm"
RPM_HASH = "5df0009e04c3855e02281b6fb13d54ff16251814f4256ce0f0489823b03eb508d8c69e9bb6feaf2d2a32177211b6010e90307e1b923d6d8c4983bc34782583c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scikit-sound) \
python39-scikit-sound \
python3dist(scikit-sound)"

RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-appdirs \
python39-docutils \
python39-pygame \
python39-scipy"

inherit rpm
