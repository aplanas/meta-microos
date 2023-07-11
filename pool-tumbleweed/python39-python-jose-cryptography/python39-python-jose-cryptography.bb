SUMMARY = "JOSE implementation in Python, cryptography extra"
DESCRIPTION = "A JavaScript Object Signing and Encryption (JOSE) technologies \
implementation in Python. \
 \
python-jose implements three different cryptographic backends. \
This package provides the python-jose[cryptography] extra."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-python-jose-cryptography-3.3.0-2.2.noarch.rpm"
RPM_HASH = "a67a9a93155bb9d7d8cafbd1cd6102e919ed7390328618d5fb7456de730f2d153a7d8e661b60131c00ab8c7f943a2080bab380861e6e861fda8170e10a55f261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-python-jose-cryptography"

RDEPENDS:${PN} += "python39-cryptography \
python39-python-jose"

inherit rpm
