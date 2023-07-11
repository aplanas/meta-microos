SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "python311-jplephem-2.15-2.11.noarch.rpm"
RPM_HASH = "ae3c0b710aa7a7b9116b982c824680555d30886ed53de7b195209aff9c8033d9c6b579456a6bfdb7e2e84e16ae000e43722b7c0a8477fa81ba431b1fafc26757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jplephem \
python3.11dist-jplephem \
python311-jplephem \
python3dist-jplephem"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
