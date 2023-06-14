SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python311-pbkdf2-1.3-3.12.noarch.rpm"
RPM_HASH = "6ddb22a384503990e610587a42c81380c5590dc31ecf94453105a2fabe5d0f936764807c2bdc81be1f34149b0d3833c1518769044a74e185a02aa2a3c0d2f73e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pbkdf2 \
python311-pbkdf2 \
python3dist-pbkdf2"

RDEPENDS:${PN} += "python-abi \
python311-pycrypto"

inherit rpm
