SUMMARY = "A parser for COADS-compliant dates"
DESCRIPTION = "This module parses time values represented using the COARDS \
convention."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python39-coards-1.0.5-2.15.noarch.rpm"
RPM_HASH = "dc1533f83f4480a290b607967ebc92e6b742f40107dcc22ada2bdf574a83f83c1e855545275939279d13cef592227c3ea6bc4ba6f69a53cd3646363d345a363e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coards \
python39-coards \
python3dist-coards"

RDEPENDS:${PN} += "python-abi"

inherit rpm
