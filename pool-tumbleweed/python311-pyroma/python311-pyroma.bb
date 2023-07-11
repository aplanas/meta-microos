SUMMARY = "Program to test a Python project's adherence to packaging guidelines"
DESCRIPTION = "Pyroma is a package that gives a rating of how well a Python project \
complies with the best practices of the Python packaging ecosystem, \
primarily PyPI, pip, Distribute, etc., as well as a list of issues \
that could be improved. \
 \
It's written so that there are a library with methods to call from Python, as \
well as a script, also called pyroma."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "python311-pyroma-3.1-1.11.noarch.rpm"
RPM_HASH = "c6ccfd93cff637d022076c99c011d5371d967fdd46832a015d8e27b0be5d599f560848a26d4554a3772d72b88ad1bb8e34c110cab4610d7eed709497818aa695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyroma \
python3.11dist-pyroma \
python311-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pygments \
python311-docutils \
python311-setuptools \
update-alternatives"

inherit rpm
