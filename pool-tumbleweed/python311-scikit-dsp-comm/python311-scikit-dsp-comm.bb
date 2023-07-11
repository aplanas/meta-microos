SUMMARY = "DSP and Comm package for Python"
DESCRIPTION = "This package is a collection of functions and classes to support \
signal processing and communications theory teaching and research. \
The foundation for this package is scipy.signal."
LICENSE = "BSD-2-Clause"

PV = "1.2.0"

RPM_NAME = "python311-scikit-dsp-comm-1.2.0-3.10.noarch.rpm"
RPM_HASH = "ab97d8f61bb70dd100519d53415c30ef02a5380e7d5c8522423e77d76c0b45a4cdddaca8158c31f01c4596cb7d9aeb027c824bccacf9302a39e6d7a169c1c60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-dsp-comm \
python3.11dist-scikit-dsp-comm \
python311-scikit-dsp-comm \
python3dist-scikit-dsp-comm"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-scipy"

inherit rpm
