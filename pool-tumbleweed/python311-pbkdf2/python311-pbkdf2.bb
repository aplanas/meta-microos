SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python311-pbkdf2-1.3-3.14.noarch.rpm"
RPM_HASH = "4b3477852c0634fc9db6fbaf2b03305c9aa5faf3c945d875cf22c18efc625f88c75207bbf235869d1d10cbc3c1cf52850b3cfd249147051e2ddbb90419f88c57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbkdf2 \
python3.11dist-pbkdf2 \
python311-pbkdf2 \
python3dist-pbkdf2"

RDEPENDS:${PN} += "python-abi \
python311-pycrypto"

inherit rpm
