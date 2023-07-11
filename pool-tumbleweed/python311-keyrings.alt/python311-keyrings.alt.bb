SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-keyrings.alt-4.2.0-1.3.noarch.rpm"
RPM_HASH = "969ae0a821c79040486166873073a23966216911d17cf9d1a453dd64f0957785cfbd2eae9c5aaad96a9caa418d01068f221e565a171f75a7fc7e8eac8da86fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyrings.alt \
python3.11dist-keyrings.alt \
python311-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-pycryptodomex"

inherit rpm
