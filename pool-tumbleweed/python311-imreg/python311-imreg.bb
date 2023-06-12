SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2022.9.27"

RPM_NAME = "python311-imreg-2022.9.27-1.1.noarch.rpm"
RPM_HASH = "4ec8d47e6e495fd38002cb77e26e0f756c0a98876ec00cf3614b766df3b5ea9d4d81c90c210f5343e12ca88a21fdba082564fb9cf94be79f004849bd49f8458f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(imreg) \
python311-imreg \
python3dist(imreg)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy \
python311-scipy"

inherit rpm
