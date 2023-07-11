SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python311-ecdsa-0.18.0-2.3.noarch.rpm"
RPM_HASH = "d1bb21e9f6b4fca9adab0fbfd763c443afee8b465a253c8d64c0c715a4e61caed0cb894e3c6c9d7679c51bc19a21c302a0263d8434a8ec70827431cfed214f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ecdsa \
python3.11dist-ecdsa \
python311-ecdsa \
python3dist-ecdsa"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
