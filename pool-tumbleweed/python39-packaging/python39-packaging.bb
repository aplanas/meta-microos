SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python39-packaging-23.1-2.4.noarch.rpm"
RPM_HASH = "32497d057fbfc18359ecc04abc8afd49bbe9147c440f58e27ea8a2a3abf9674c2207a3d79bef839fc5106ec728dc0560cfbc2e3a4f4ab28116ad367148a2c033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-packaging \
python39-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
