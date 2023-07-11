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

RPM_NAME = "python39-thLib-0.12.2-5.10.noarch.rpm"
RPM_HASH = "91ad79eb685a9282b086598aeebe856456b0a56db559bc4215becb95438da0f5a003841d5563f048118b6b7e4897e16165dc346b3f4587f66db57bf5bcc269c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-thlib \
python39-thLib \
python3dist-thlib"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-pandas \
python39-scikit-image \
python39-scipy \
python39-statsmodels \
python39-sympy"

inherit rpm
