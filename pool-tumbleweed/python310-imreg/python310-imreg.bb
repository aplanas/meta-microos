SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2022.9.27"

RPM_NAME = "python310-imreg-2022.9.27-1.1.noarch.rpm"
RPM_HASH = "8ad444e1edacbd6b306ecf5a67d72ecc7608763ca51bf21a9c4c7a6266c39f0b03c4f23a5da3c95c6225aa8af78e70f51942b8ea74427e72c6384a0ca8aed352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imreg \
python3.10dist-imreg \
python310-imreg \
python3dist-imreg"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy"

inherit rpm
