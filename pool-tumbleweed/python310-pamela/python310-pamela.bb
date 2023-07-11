SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-pamela-1.0.0-1.15.noarch.rpm"
RPM_HASH = "c9c45851a695fb4038107cce1a580064bdbc91333f8b50e2d68f6ebe8366013fa68ae0cf54013cb950881229e2cce47490449098b87606d6d1d21e1382cca83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pamela \
python310-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
