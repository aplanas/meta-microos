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

RPM_NAME = "python310-thLib-0.12.2-5.10.noarch.rpm"
RPM_HASH = "fb53750d94ad0a53ac8f06f8415ceb0dc63795ab8d3d30e48533eb5a16c2d294909824ced0b471b3bf3ffd9a32204314bdfc0a0b15a33e80a7a2c29227625565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-thlib \
python310-thLib \
python3dist-thlib"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-pandas \
python310-scikit-image \
python310-scipy \
python310-statsmodels \
python310-sympy"

inherit rpm
