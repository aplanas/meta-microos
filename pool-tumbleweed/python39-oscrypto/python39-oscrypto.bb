SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python39-oscrypto-1.3.0-1.3.noarch.rpm"
RPM_HASH = "07b0acf017094212a79626cf1485c6d76020c0413092d5ec06d2396439d5d8ad66b1903fa124991c1f47c8d0010072bbe4f9ecbef0bcbecef85c8f9970fb8e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oscrypto \
python39-oscrypto \
python3dist-oscrypto"

RDEPENDS:${PN} += "python-abi \
python39-asn1crypto"

inherit rpm
