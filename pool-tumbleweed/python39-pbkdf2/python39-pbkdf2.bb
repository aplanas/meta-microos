SUMMARY = "PKCS#5 v2.0 PBKDF2 Module"
DESCRIPTION = "This module implements the password-based key derivation function, PBKDF2, specified in RSA PKCS#5 v2.0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python39-pbkdf2-1.3-3.14.noarch.rpm"
RPM_HASH = "3059af3a7362f950f24174dca50e9d580f7152f26230ab2f0e874002a9c3a8ad05f6f65647a6da06ab6ee4c2510affc983df17db648f46b6b87d07f6760c61ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pbkdf2 \
python39-pbkdf2 \
python3dist-pbkdf2"

RDEPENDS:${PN} += "python-abi \
python39-pycrypto"

inherit rpm
