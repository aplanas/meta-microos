SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-oscrypto-1.3.0-1.4.noarch.rpm"
RPM_HASH = "e36a9c35309bcc2a6fdf8faf0c0aa6a5a86c3e98a63d6d3683752edce1bf374c36674910047ea7c45e54b45b0f0da07d39037220f05758ad824c6f37b63058ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oscrypto \
python310-oscrypto \
python3dist-oscrypto"

RDEPENDS:${PN} += "python-abi \
python310-asn1crypto"

inherit rpm
