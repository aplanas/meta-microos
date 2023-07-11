SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-pytest-flask-1.2.0-1.3.noarch.rpm"
RPM_HASH = "452f14f8ecd54c39073dd41a1583089fffcbbab286f3e231efed4cc2526e5536dd669f0069134a5c9628734caee5ff4c8cd99960f90ec38ccc8b7e0fd74bcdd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-flask \
python310-pytest-flask \
python3dist-pytest-flask"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-Werkzeug \
python310-pytest"

inherit rpm
