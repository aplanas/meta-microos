SUMMARY = "A set of py.test fixtures to test Flask applications"
DESCRIPTION = "An extension of pytest test runner which provides a set of useful tools \
to simplify testing and development of the Flask extensions and applications."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-pytest-flask-1.2.0-1.3.noarch.rpm"
RPM_HASH = "30d10cc43eadc21fc3bcb3ab33ef0227b5fb8132997a6ec1eab3e209f4a46620015086a9ab4586fdd1f5bce04da1198dd0e7fa88185ebaa704a1e52e1fb07f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-flask \
python3.11dist-pytest-flask \
python311-pytest-flask \
python3dist-pytest-flask"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-Werkzeug \
python311-pytest"

inherit rpm
