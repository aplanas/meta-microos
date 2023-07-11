SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2022.9.27"

RPM_NAME = "python39-imreg-2022.9.27-1.3.noarch.rpm"
RPM_HASH = "279f9bb4f97d50df4a7f4d36e44b56fd5dfaff10902a74a44d5aa3062734efca5c260ed28ecb023901d5c9ed12512919c401f0e5c3f7cff23b96a5cbb4d58f44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-imreg \
python39-imreg \
python3dist-imreg"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy"

inherit rpm
