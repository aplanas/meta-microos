SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-keyrings.alt-4.2.0-1.3.noarch.rpm"
RPM_HASH = "3641a5c9478633fbe5d39ec8f753ad6eb40fda1b3c18bbeb1a76c3d7d19950efc75a56c88288fd0378e38c08935506be3a65386163c33b224db06013bae481a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-keyrings.alt \
python310-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.classes \
python310-pycryptodomex"

inherit rpm
