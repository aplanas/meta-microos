SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python39-securesystemslib-0.21.0-2.2.noarch.rpm"
RPM_HASH = "19634f0a4d434aec5f6e7c99d901ae198aec67266e411dd8f91bd53d61449725c3fd7dc9c0f031434359c1fb7ac2858a4e027bebc05218c214a69bf619b29bda"
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
