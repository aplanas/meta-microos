SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python310-pbkdf2-1.3-3.12.noarch.rpm"
RPM_HASH = "5936c602243dbffb8b6d16deb942dc7e9113ea0949c7b407f47becf427ace64b3deb68fef0c94dfbc769a43815f7b6069c6b80d34c8c9a28429b33708d6ed862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pbkdf2 \
python3.10dist(pbkdf2) \
python310-pbkdf2 \
python3dist(pbkdf2)"

RDEPENDS:${PN} += "python(abi) \
python310-pycrypto"

inherit rpm
