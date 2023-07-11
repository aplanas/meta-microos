SUMMARY = "JOSE implementation in Python, cryptography extra"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements three different cryptographic backends. \
This package provides the python-jose[cryptography] extra."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-python-jose-cryptography-3.3.0-2.2.noarch.rpm"
RPM_HASH = "fa753ba72102c955155dd91df8cab406a2b3c745659b44ddee513572c710af8ebecaa1969a8220df963d163302577f991ca518cb10bfcb77774bffa9f3f61341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-python-jose-cryptography"

RDEPENDS:${PN} += "python310-cryptography \
python310-python-jose"

inherit rpm
