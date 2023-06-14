SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-keyrings.alt-4.2.0-1.1.noarch.rpm"
RPM_HASH = "8671093ce5cf21829332b8e44f424746d7c90698a3aa4365ef2bdb3107aa61d77e916cc0f4ae913d931cd47f1c221dd610dc5c10e9fcf29c693bda39c91b1e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-keyrings.alt \
python311-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-pycryptodomex"

inherit rpm
