SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python39-packaging-23.1-2.1.noarch.rpm"
RPM_HASH = "d3ada9d2b594962017edaaed48dabc6dcffbd146d691dfba84178bff9fb44c7be061b32849a942b89c8f3a8101a120c67679a82cd489c2b3fb707369c3071de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(packaging) \
python39-packaging \
python3dist(packaging)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
