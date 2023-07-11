SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-leather-0.3.4-2.3.noarch.rpm"
RPM_HASH = "d78500d865bb577caebfc62b4f699c7b8ee451b259c27e0cd2372ee8dd95832bdea108dc0aca5ab79398822219ddc46773c6e43b7743a672142a008e74027565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-leather \
python310-leather \
python3dist-leather"

RDEPENDS:${PN} += "python-abi"

inherit rpm
