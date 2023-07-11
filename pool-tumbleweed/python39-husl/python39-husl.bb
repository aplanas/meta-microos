SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python39-husl-4.0.3-3.18.noarch.rpm"
RPM_HASH = "b153cb82b1970573022cbbac23ab5d9e62188276a786cb8d334ecdb2c68d5e0b13d1d688e2f8409163db68c6d30937add5a6713967fe1fccc2850ae12d42051f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-husl \
python39-husl \
python3dist-husl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
