SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python311-packaging-23.1-2.1.noarch.rpm"
RPM_HASH = "7aaece05a738f57413faa0531e984adfd30d38a950364158b20f35240860b7beea05d0d10e1f4f7226dc257e57f21fabe6df829ac6157cf12fb60cc28c0cd071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(packaging) \
python311-packaging \
python3dist(packaging)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
