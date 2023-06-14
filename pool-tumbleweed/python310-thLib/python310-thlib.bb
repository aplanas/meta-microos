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

RPM_NAME = "python310-thLib-0.12.2-5.8.noarch.rpm"
RPM_HASH = "5e37340d894ed8179088f4e4f069f83da975f3f85c1b77a4405c581ed2fe1459e60b8c84e5ef96d66069862ad2a532b7a62f605091a00714b1b265a809df7c3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-thLib \
python3.10dist-thlib \
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
