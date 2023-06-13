SUMMARY = "Collection of Python utilities for signal analysis"
DESCRIPTION = "The thLib package contains functions for working with sound, and for \
fitting circles, lines, sine-waves, and exponential decays. For \
signal processing, a Savitzky-Golay filter is included, as well as a \
demonstration of the calculation of a power spectrum. UI utilities, \
and a few useful vector functions (e.g. an implementation of the\\ \
Savitzky-Golay algorithm) round off thLib. \
 \
Note: All functions for working with 3D kinematics have been moved into \
the new package 'scikit-kinematics'!"
LICENSE = "BSD-2-Clause"

PV = "0.12.2"

RPM_NAME = "python39-thLib-0.12.2-5.8.noarch.rpm"
RPM_HASH = "de161a23b6635df8ad2bd7c5a10a355e596665cbe58f06c150f55a091ed6ed31a765bd8b64abf39c41003f75cd904b4d862776dbfe2b96e0316606c3c103ff6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(thlib) \
python39-thLib \
python3dist(thlib)"

RDEPENDS:${PN} += "python(abi) \
python39-matplotlib \
python39-numpy \
python39-pandas \
python39-scikit-image \
python39-scipy \
python39-statsmodels \
python39-sympy"

inherit rpm
