SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python310-packaging-23.1-2.4.noarch.rpm"
RPM_HASH = "14e38f43b355ffc1416122adf34b584b7280383b75dfcca062b8b65de3e4d1e955b63804372139bcdd56660ffdaef541922a1dfc6a00f334abe276227be2406d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-packaging \
python310-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
