SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python310-pbkdf2-1.3-3.14.noarch.rpm"
RPM_HASH = "ce78e7b345751493a601d0e9b4372019cf26340cbf5e1835a2e5539774817900c73ae06c723a423021ee1f448e98a4c59b09239b7a905a008bfff61554326020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pbkdf2 \
python310-pbkdf2 \
python3dist-pbkdf2"

RDEPENDS:${PN} += "python-abi \
python310-pycrypto"

inherit rpm
