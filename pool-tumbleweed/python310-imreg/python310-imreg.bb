SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2022.9.27"

RPM_NAME = "python310-imreg-2022.9.27-1.3.noarch.rpm"
RPM_HASH = "1eca49cd6e3fed57a2fa053a855e80957c6b4e6de97b78f6f2b01994b37770d708921cf94906a0fbbe0175aca17acd551d716962084575e42f13e30499286e08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-imreg \
python310-imreg \
python3dist-imreg"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy"

inherit rpm
