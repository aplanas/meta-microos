SUMMARY = "Itertools and builtins for AsyncIO and mixed iterables"
DESCRIPTION = "Implementation of itertools, builtins, and more for AsyncIO and mixed-type iterables."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python311-aioitertools-0.11.0-1.3.noarch.rpm"
RPM_HASH = "2e99603e2a02e35928307a57be83ed4566a33a64a5bee4341288daf3820eda25d262b253c3c64c2b1a94f06983302b4cdb2db27a1eb79e93c7e870498efe421a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aioitertools) \
python311-aioitertools \
python3dist(aioitertools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
