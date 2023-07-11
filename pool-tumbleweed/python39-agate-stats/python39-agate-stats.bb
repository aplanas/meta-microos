SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-agate-stats-0.4.0-3.4.noarch.rpm"
RPM_HASH = "7cc24f2201de7421f478b30787be41e91dcac244590c916746106ad286b1035bdd2c8b4b583631ad54a6aec3e0345f5c6bee0e11100e8a15644787f06489f790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-agate-stats \
python39-agate-stats \
python3dist-agate-stats"

RDEPENDS:${PN} += "python-abi \
python39-agate \
python39-six"

inherit rpm
