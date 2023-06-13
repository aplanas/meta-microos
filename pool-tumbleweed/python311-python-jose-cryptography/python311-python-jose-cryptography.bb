SUMMARY = "JOSE implementation in Python, cryptography extra"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements three different cryptographic backends. \
This package provides the python-jose[cryptography] extra."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-python-jose-cryptography-3.3.0-1.5.noarch.rpm"
RPM_HASH = "934b22fa55d84943db155753327e89d43e56ee8cb1c8a1e7a91effc5337155085890dfce229bcb182d4dbcdf0327a9a4a1368b50982c693bc11519d5f7129066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-python-jose-cryptography"

RDEPENDS:${PN} += "python311-cryptography \
python311-python-jose"

inherit rpm
