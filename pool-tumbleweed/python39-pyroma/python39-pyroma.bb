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

RPM_NAME = "python39-pyroma-3.1-1.11.noarch.rpm"
RPM_HASH = "63e0f95f059d16ce1ca95aeb8486cd5788c08730afc89be4b5aa8f712a0a25b881d6b5c9fde37ef84cfbeb67ab944d9753ed0864e61194f3aba515d046e01578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyroma \
python39-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pygments \
python39-docutils \
python39-setuptools \
update-alternatives"

inherit rpm
