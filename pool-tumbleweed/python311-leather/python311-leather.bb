SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-leather-0.3.4-2.3.noarch.rpm"
RPM_HASH = "b5fd9834551e12e9bdf17149bdfc162ae1e42c906db84033791ba923607d4d5192727698087ae053a5e2c2a006d4af608787522553b628ab8b55082c1ec3156e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-leather \
python3.11dist-leather \
python311-leather \
python3dist-leather"

RDEPENDS:${PN} += "python-abi"

inherit rpm
