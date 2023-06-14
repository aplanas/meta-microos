SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python311-mohawk-1.1.0-5.4.noarch.rpm"
RPM_HASH = "b13b46b8d8035df973f85c4c095f7b979934055da6f3f6c8de0d37ae6ab20b701ae3a288e9460428ed24fd7a4ca4095d50ec7d3c6c0daa27d2fc2915b9d6ecee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mohawk \
python311-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
