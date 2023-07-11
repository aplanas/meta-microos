SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python311-packaging-23.1-2.3.noarch.rpm"
RPM_HASH = "989851c3790402a11e97a510a0b85def059ccc0270bdf0fb99245dff942c6c41375597e653e8ac385003f1a2560d952a0cb5f27455dbb172eebfcc4ce9053efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-packaging \
python3.11dist-packaging \
python311-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
