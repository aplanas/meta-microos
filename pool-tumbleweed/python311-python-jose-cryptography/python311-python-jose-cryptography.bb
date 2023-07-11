SUMMARY = "JOSE implementation in Python, cryptography extra"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements three different cryptographic backends. \
This package provides the python-jose[cryptography] extra."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-python-jose-cryptography-3.3.0-2.2.noarch.rpm"
RPM_HASH = "0714ddcdf911a7fdc6a901c35bc0f16e0d20a37067427a3059ced8d1cc3286229bf52726c6c451ea7d8a633d1d797d3bc7dbe9a7b1da4345e3c08ab0b54cf401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jose-cryptography \
python311-python-jose-cryptography"

RDEPENDS:${PN} += "python311-cryptography \
python311-python-jose"

inherit rpm
