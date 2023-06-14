SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-leather-0.3.4-2.1.noarch.rpm"
RPM_HASH = "6788ba8958f6f9bb7bebd027a498ce54328386d32cef0639ca379f934cd15d36d5f164452ae5f9774f73a88c2d9b38d1746e914ac2bf7007d006b817ac6ed696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-leather \
python3.10dist-leather \
python310-leather \
python3dist-leather"

RDEPENDS:${PN} += "python-abi"

inherit rpm
