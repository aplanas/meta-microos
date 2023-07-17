SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-keyrings.alt-4.2.0-2.1.noarch.rpm"
RPM_HASH = "c8b8ec413a77939cd7efe310b2260311f439f45d1668a9d5de5f0b644a2061e42da09f4b30ac310f6150d7547a90be5b04dff6505a37501b5a70599fa0fdd168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-keyrings.alt \
python310-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.classes \
python310-pycryptodomex"

inherit rpm
