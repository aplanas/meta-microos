SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-oscrypto-1.3.0-1.4.noarch.rpm"
RPM_HASH = "bc4f4bfd5364f22a7b1d113b9664688940237ff981c3d9ce48d15717b45861f4c4b131b60a182a8fdf171d9f1d1db9a492c2f5d276f61a3a8cc21416a5550b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oscrypto \
python3.11dist-oscrypto \
python311-oscrypto \
python3dist-oscrypto"

RDEPENDS:${PN} += "python-abi \
python311-asn1crypto"

inherit rpm
