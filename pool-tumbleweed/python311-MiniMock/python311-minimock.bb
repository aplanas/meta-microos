SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-MiniMock-1.3.0-1.11.noarch.rpm"
RPM_HASH = "e1d8b4da116e6bd0a60ac06228b4de5afdb654360546e86dac7120e7b6c2d25d330460c7324f5df1fdb59f0fb3237e571cc1a1a7bc50b7b006bedd1cf57afd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-minimock \
python311-MiniMock \
python3dist-minimock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
