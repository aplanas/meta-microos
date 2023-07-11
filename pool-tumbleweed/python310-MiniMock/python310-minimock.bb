SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-MiniMock-1.3.0-1.12.noarch.rpm"
RPM_HASH = "deb93e1366f8f149d3804bc6816ccfac39cc5e903729904ba7395a83907dc465874c9d297899951d744660651d00d0b9fde431b2dbe36a5929e32963af0574e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-minimock \
python310-MiniMock \
python3dist-minimock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
