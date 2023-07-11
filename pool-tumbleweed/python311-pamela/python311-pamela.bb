SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pamela-1.0.0-1.15.noarch.rpm"
RPM_HASH = "c037b48046b2cac431ee70d38b66f7a9c7c8ab9db8b5ef820d44e23152d5a88e0004694e9a32ce83d8fb3068b881d73b38fd87b6f2da215e00ff1e0a802b14c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pamela \
python3.11dist-pamela \
python311-pamela \
python3dist-pamela"

RDEPENDS:${PN} += "python-abi"

inherit rpm
