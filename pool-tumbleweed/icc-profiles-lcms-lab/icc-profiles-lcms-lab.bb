SUMMARY = "Default PCS profiles"
DESCRIPTION = "Special LCMS profiles for PCS color spaces."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-lcms-lab-1.2-16.21.noarch.rpm"
RPM_HASH = "2c23065dc7c9357489665b140f476bf75b0de8705f5f6d0c9d6644cfb2b33ac9c3159ce6f900448a3495c19abcc737e4a66d002b33422289890be4097ef8d600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-lcms-lab"
RDEPENDS:${PN} += "color-filesystem"

inherit rpm
