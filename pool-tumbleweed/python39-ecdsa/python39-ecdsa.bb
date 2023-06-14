SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-ecdsa-0.18.0-2.1.noarch.rpm"
RPM_HASH = "e9ade11f1f4e6d8fd5d44d8dfdabb492bea7063417bfd283cc63c8488bfd28452330133e5dce3cb7dfb983a6e84cdae29e9d300854c8e5bea85fc3ef0d640a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ecdsa \
python39-ecdsa \
python3dist-ecdsa"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
