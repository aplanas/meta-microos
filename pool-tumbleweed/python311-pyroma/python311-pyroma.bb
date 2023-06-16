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

RPM_NAME = "python311-pyroma-3.1-1.9.noarch.rpm"
RPM_HASH = "cf47906808ba91206d1612728fe69614389ecf515d51de54ea94ee3bb6fb25e8aeeb6737e7e9f9d9693d81c9e0961a53ae485efaff7b5dc9f7168d8b29eee4be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyroma \
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
