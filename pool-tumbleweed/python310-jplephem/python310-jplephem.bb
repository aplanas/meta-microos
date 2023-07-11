SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "python310-jplephem-2.15-2.11.noarch.rpm"
RPM_HASH = "94ef7b303a42a5c61cf3997f01c0f56add999ab09c1038db4598064a76c379fccb4f8473d02c6ee9bcacf56826ebd61e878c42a5f13f2f44c5d3cc30c3acb50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jplephem \
python310-jplephem \
python3dist-jplephem"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
