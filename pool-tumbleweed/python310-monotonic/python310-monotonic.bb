SUMMARY = "An implementation of time.monotonic() for Python 2 & < 33"
DESCRIPTION = "This module provides a ``monotonic()`` function which returns the \
value (in fractional seconds) of a clock which never goes backwards."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python310-monotonic-1.6-1.8.noarch.rpm"
RPM_HASH = "f3f5bdcb7f48f4c73573bbde6d4d077bc6ebfbe4425ffa9525a68c01aba2e47f0a89f621309f5c92a51433b30f6f3c9784de195ed3988ac480d3eb2e68194ca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-monotonic \
python3.10dist-monotonic \
python310-monotonic \
python3dist-monotonic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
