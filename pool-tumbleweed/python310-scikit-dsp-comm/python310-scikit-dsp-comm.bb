SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python310-scikit-dsp-comm-1.2.0-3.10.noarch.rpm"
RPM_HASH = "d5804e2e7c058161aacd9c24f9b12be25f350f494e78850f77db98beb9b9c2cfa2b85653ecac8908cd10c8a09b98b34a97f2039fc1e0f4c90bb3aac0e14a39b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scikit-dsp-comm \
python310-scikit-dsp-comm \
python3dist-scikit-dsp-comm"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-numpy \
python310-scipy"

inherit rpm
