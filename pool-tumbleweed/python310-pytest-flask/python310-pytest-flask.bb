SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-pytest-flask-1.2.0-1.1.noarch.rpm"
RPM_HASH = "a8f7025a0cc0341af658dee3b72c30ad6a5e66daff58bbaf5e0396bca25df76ce3cf215caab457e1ce43d866a3bdd1c4f15741e276c1d7ec248f05e74ba838da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flask \
python3.10dist(pytest-flask) \
python310-pytest-flask \
python3dist(pytest-flask)"
RDEPENDS:${PN} += "python(abi) \
python310-Flask \
python310-Werkzeug \
python310-pytest"

inherit rpm
