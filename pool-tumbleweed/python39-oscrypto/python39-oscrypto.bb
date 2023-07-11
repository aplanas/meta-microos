SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-oscrypto-1.3.0-1.4.noarch.rpm"
RPM_HASH = "e2a53e26f91a36c5a2d2cb4bed187a0de2b6d5a518493925f9c51a34d323d00e088753760eab2da6d6cf526532639d1c587b12ab0326b4d84fb4ed02f5a32b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oscrypto \
python39-oscrypto \
python3dist-oscrypto"

RDEPENDS:${PN} += "python-abi \
python39-asn1crypto"

inherit rpm
