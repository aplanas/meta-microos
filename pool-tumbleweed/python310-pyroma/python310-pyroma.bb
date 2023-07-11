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

RPM_NAME = "python310-pyroma-3.1-1.11.noarch.rpm"
RPM_HASH = "1bb9415efaa3d6ee006c9fbd5629fca616e8617af121b9ef628180cb8c898c08785ee685046770ea38bfb02524242b78c0626f51402a89b80ac0eadcf5130e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyroma \
python310-pyroma \
python3dist-pyroma"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pygments \
python310-docutils \
python310-setuptools \
update-alternatives"

inherit rpm
