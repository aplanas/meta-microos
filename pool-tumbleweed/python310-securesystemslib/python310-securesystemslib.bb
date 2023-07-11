SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python310-securesystemslib-0.21.0-2.2.noarch.rpm"
RPM_HASH = "cffb7d00007b46b7e8b7f83b631cb2ba9420dffb24b308cdad5f8fec75e562268203f2e6d51d3513ae19f5f3200385177baefe6bbdb69006a8192bed8d0173f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-securesystemslib \
python310-securesystemslib \
python3dist-securesystemslib"

RDEPENDS:${PN} += "python-abi \
python310-PyNaCl \
python310-asn1crypto \
python310-colorama \
python310-cryptography"

inherit rpm
