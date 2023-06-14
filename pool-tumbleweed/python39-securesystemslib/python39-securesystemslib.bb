SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python39-securesystemslib-0.21.0-2.1.noarch.rpm"
RPM_HASH = "8fdd41fda9d13cc576f2adacf5864e22b531d795d04c10bd531da14b714825ad6bff58b81d9c64944d4c3859e7f7df3525a5c69300f0ef350f0e2716980535bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-securesystemslib \
python39-securesystemslib \
python3dist-securesystemslib"

RDEPENDS:${PN} += "python-abi \
python39-PyNaCl \
python39-asn1crypto \
python39-colorama \
python39-cryptography"

inherit rpm
