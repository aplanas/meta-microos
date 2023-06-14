SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-pytest-flask-1.2.0-1.1.noarch.rpm"
RPM_HASH = "f2d443bf9c31bb699bff10a52eb2894022f9324f47eae7c403dfc60f550da29cf475b978b542fe8688743afbdac53ec9f2ef2ca3e4bde00ad66cb18bd3aa10dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-flask \
python39-pytest-flask \
python3dist-pytest-flask"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Werkzeug \
python39-pytest"

inherit rpm
