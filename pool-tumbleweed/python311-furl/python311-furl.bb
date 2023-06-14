SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.3"

RPM_NAME = "python311-furl-2.1.3-2.1.noarch.rpm"
RPM_HASH = "40a8ad782cb96835c5eb692be70320494331ec5067656d7c654f77eba0aa56f6a76e50afd3839e196f8d4d9ad5c6651b274fa64af8ea463511b1b01ed02acb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-furl \
python311-furl \
python3dist-furl"

RDEPENDS:${PN} += "python-abi \
python311-orderedmultidict \
python311-six"

inherit rpm
