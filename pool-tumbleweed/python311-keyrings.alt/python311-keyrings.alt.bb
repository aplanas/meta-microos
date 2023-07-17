SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-keyrings.alt-4.2.0-2.1.noarch.rpm"
RPM_HASH = "724ce6501f7e16513cc172af3277b1e9aa102046f949c3cf227f94416011467ca51402e825270a8f7d242275be2c4abdf5c574f3dc159fcd21ee276cf7ffe49d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyrings.alt \
python3.11dist-keyrings.alt \
python311-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-pycryptodomex"

inherit rpm
