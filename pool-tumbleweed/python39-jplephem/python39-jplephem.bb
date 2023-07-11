SUMMARY = "Planet position predictor using a JPL ephemeris"
DESCRIPTION = "This package can load and use a Jet Propulsion Laboratory (JPL) \
ephemeris for predicting the position and velocity of a planet or other \
Solar System body.  It only needs NumPy <http://www.numpy.org/>`."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "python39-jplephem-2.15-2.11.noarch.rpm"
RPM_HASH = "e2cae4351a0be434c17ac7f011756b58667f784c174200bcc8e248045e8d489344a9d426cf8bb28ae513bf0e3a4b17dd04961765b2640932e37e5bae2739d090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jplephem \
python39-jplephem \
python3dist-jplephem"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
