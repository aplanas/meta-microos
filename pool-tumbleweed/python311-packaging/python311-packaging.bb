SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Reusable core utilities for various Python Packaging interoperability specifications. \
 \
This library provides utilities that implement the interoperability specifications \
which have clearly one correct behaviour (eg: PEP 440) or benefit greatly from having \
a single shared implementation (eg: PEP 425)."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "23.1"

RPM_NAME = "python311-packaging-23.1-3.1.noarch.rpm"
RPM_HASH = "1a34c0271cc692781a8494d0125da9470bc0a1c6a09ee41aadcddabacf382e00aa3d0303d76b3e1f2a9d5de8ee5abd214c1d8e0190126b5d3693b6e29b595283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-packaging \
python3.11dist-packaging \
python311-packaging \
python3dist-packaging"

RDEPENDS:${PN} += "python-abi"

inherit rpm
