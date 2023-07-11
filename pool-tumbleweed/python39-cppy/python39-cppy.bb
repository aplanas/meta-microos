SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-cppy-1.2.1-2.3.noarch.rpm"
RPM_HASH = "2dbdd06d98e7fc60ce005f27b5e229662fa58825c183459fc8ea38f8f862ec05e739f89aa496ccdaff893277eee28b3555d477a2be74ce69544288fadefc9f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cppy \
python39-cppy \
python3dist-cppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
