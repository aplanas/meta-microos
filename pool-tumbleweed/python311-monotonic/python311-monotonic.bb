SUMMARY = "An implementation of time.monotonic() for Python 2 & < 33"
DESCRIPTION = "This module provides a ``monotonic()`` function which returns the \
value (in fractional seconds) of a clock which never goes backwards."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python311-monotonic-1.6-1.9.noarch.rpm"
RPM_HASH = "4d21c6bedb0c903e9afb70721c9852de9007c9c9b98f935edd785e6e23206630d1592ce97338191090030b2912d18b0bbb10dfbb5232d04da913149a50b1794a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-monotonic \
python3.11dist-monotonic \
python311-monotonic \
python3dist-monotonic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
