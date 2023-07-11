SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python39-scikit-dsp-comm-1.2.0-3.10.noarch.rpm"
RPM_HASH = "5fabb743217fb38f36da5036b09d786a81711619f5da5cb4898d389e2dff5016b5d2a03cd74eeda20f5933e8b2501eb406c6abe25dc0efe3acecade54fbb0123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scikit-dsp-comm \
python39-scikit-dsp-comm \
python3dist-scikit-dsp-comm"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-numpy \
python39-scipy"

inherit rpm
