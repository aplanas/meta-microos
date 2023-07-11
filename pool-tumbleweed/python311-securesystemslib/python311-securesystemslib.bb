SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "python311-securesystemslib-0.21.0-2.2.noarch.rpm"
RPM_HASH = "72b1935f2c6f64a4883f19ea153e704806a47f2d7419c7fabfa0783d52667762b13d3142c9fc4a328039a9b23325831aa446ac3df633c8e33a42b6152a753351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-securesystemslib \
python3.11dist-securesystemslib \
python311-securesystemslib \
python3dist-securesystemslib"

RDEPENDS:${PN} += "python-abi \
python311-PyNaCl \
python311-asn1crypto \
python311-colorama \
python311-cryptography"

inherit rpm
