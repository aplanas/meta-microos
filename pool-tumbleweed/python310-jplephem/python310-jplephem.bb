SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "python310-jplephem-2.15-2.9.noarch.rpm"
RPM_HASH = "9c270126a092f779e145792a564c949451891793193022d5a97737f8bb939e2eefb7ed42db157e58bea864ca2f069d33223980e95323f3c4b5768691236b6f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jplephem \
python3.10dist(jplephem) \
python310-jplephem \
python3dist(jplephem)"
RDEPENDS:${PN} += "python(abi) \
python310-numpy"

inherit rpm
