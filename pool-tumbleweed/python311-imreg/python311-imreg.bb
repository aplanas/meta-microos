SUMMARY = "FFT based image registration"
DESCRIPTION = "Imreg is a Python library that implements an FFT-based technique for \
translation, rotation and scale-invariant image registration."
LICENSE = "BSD-3-Clause"

PV = "2022.9.27"

RPM_NAME = "python311-imreg-2022.9.27-1.3.noarch.rpm"
RPM_HASH = "b0530606371ca88a57a3299d4f194e762185ed6f4d4d304a4a177cb4bff63fe713157fa512c098aeddbcd8ce9e797ec7b1855933889f07836827b5765285d4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imreg \
python3.11dist-imreg \
python311-imreg \
python3dist-imreg"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy"

inherit rpm
