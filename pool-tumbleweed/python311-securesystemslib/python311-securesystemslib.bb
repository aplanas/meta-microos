SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python311-securesystemslib-0.21.0-2.1.noarch.rpm"
RPM_HASH = "64302fde8b221343e70a97eb1a5973d88fb98d385d9876e28fb9b98efed3fdeb5b793edc2e0e96693f59e55144a8ae7df11d74f74b78b2d271f7453d31428da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-securesystemslib \
python311-securesystemslib \
python3dist-securesystemslib"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-asn1crypto \
python311-colorama \
python311-cryptography"

inherit rpm
