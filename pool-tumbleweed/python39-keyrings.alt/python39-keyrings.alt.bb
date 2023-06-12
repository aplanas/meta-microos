SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-keyrings.alt-4.2.0-1.1.noarch.rpm"
RPM_HASH = "3c5943c78978bb48493f958ec61b8d07e67741b59e0092ea3c9f7bb48be0b3f58a47b409c7d7da62bcb8ef5db30ec15e3c80abf0ccde1bea6b83cd4aa06f535e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(keyrings.alt) \
python39-keyrings.alt \
python3dist(keyrings.alt)"
RDEPENDS:${PN} += "python(abi) \
python39-jaraco.classes \
python39-pycryptodomex"

inherit rpm
