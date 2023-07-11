SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-ecdsa-0.18.0-2.3.noarch.rpm"
RPM_HASH = "35c6023712cd2bea551f76c1156b13af307b45ffc8e6eeaffb60f494e18c414a514a9ff9cb941b8be3ca6b3efa7ec9d0fab770ad38600045121e9178891a28e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ecdsa \
python310-ecdsa \
python3dist-ecdsa"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
