SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "python311-jplephem-2.15-2.9.noarch.rpm"
RPM_HASH = "f738b6085d69a6a25bced971eec733625ae0979d6fa0969d0ffa3fb663a7b22d1821d592fd171e4ed71886c6d70f035e64ab429e1b92747e44b2e202367efd3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jplephem) \
python311-jplephem \
python3dist(jplephem)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm
