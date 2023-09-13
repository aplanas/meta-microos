SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python39-packaging-23.1-3.1.noarch.rpm"
RPM_HASH = "812121ace23e489d2aa7dd8c78c9707e68a042d65787aa6fdff64cd50089098495f42216e3c2f2cde45e079b7e6bed0a69cf841995ab79da3d4b4ba464158872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-packaging \
python39-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
