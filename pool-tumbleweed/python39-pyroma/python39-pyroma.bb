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

RPM_NAME = "python39-pyroma-3.1-1.9.noarch.rpm"
RPM_HASH = "782260d258bb6cdbc828252ebd89ccb1a8e3ba9b5fa6a49d90c28ea2cc762497644142fdbbefb848ccdbd069cf9ff90b68c7f2231cc3db7f49325d0c4ba81c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyroma \
python39-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Pygments \
python39-docutils \
python39-setuptools \
update-alternatives"

inherit rpm
