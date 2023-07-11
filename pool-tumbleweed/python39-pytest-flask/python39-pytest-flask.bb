SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-pytest-flask-1.2.0-1.3.noarch.rpm"
RPM_HASH = "44144822ebba5f481ff15fe700174bd0de04316f94130de8dd338553fb1292010f2410012c1565936fd0d35224eddf23198ce1e8d46e6b358ac34f9eb3e40d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-flask \
python39-pytest-flask \
python3dist-pytest-flask"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-Werkzeug \
python39-pytest"

inherit rpm
