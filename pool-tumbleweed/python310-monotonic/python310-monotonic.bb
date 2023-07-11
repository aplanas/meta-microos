SUMMARY = "An implementation of time.monotonic() for Python 2 & < 33"
DESCRIPTION = "This module provides a ``monotonic()`` function which returns the \
value (in fractional seconds) of a clock which never goes backwards."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python310-monotonic-1.6-1.9.noarch.rpm"
RPM_HASH = "3adf67061f4f245461e64b1634d5af2bcd6616f51e37f391144eaabc1fa69cb5ed6b53cb0312894a2ed9e50ce237bad915634186574e5a4f6cce6c25b8687c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-monotonic \
python310-monotonic \
python3dist-monotonic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
