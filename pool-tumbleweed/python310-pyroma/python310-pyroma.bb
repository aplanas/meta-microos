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

RPM_NAME = "python310-pyroma-3.1-1.9.noarch.rpm"
RPM_HASH = "6f4f1c2a54bb24f699888a580f48c743ad062d3bb4ec60c7d65669b7b707f834367c03bc1b583654f83508927499a1dd6b538bf9f62bd9576ae72606b714e98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyroma \
python3.10dist-pyroma \
python310-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Pygments \
python310-docutils \
python310-setuptools \
update-alternatives"

inherit rpm
