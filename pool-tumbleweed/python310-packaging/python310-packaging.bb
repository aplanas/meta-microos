SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python310-packaging-23.1-3.1.noarch.rpm"
RPM_HASH = "d33ab3690880dc54ef87c46011eacd23b7b4ddf78db30f1ba0e2e5f680e0d2310cf954924f18a8946bacc961c920ba82c8bc15d5033e674da61b9287c45b3d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-packaging \
python310-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
