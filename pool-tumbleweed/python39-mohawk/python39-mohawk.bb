SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python39-mohawk-1.1.0-5.5.noarch.rpm"
RPM_HASH = "eda7faf8c6860a6d82dbfc4fb18e4e27dfcaa71f20dda0812f5cd4be6ceeb1b59b7ec47af10c2419bfda50b824e2d2dc2acb673b5d6e20fa4460a5b15b5041e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mohawk \
python39-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
