SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python39-cookiecutter-2.1.1-2.2.noarch.rpm"
RPM_HASH = "7a1207a22443b0abe153ce0cc5acc2fa4f01792aa9d0508c49ab281d0896775a00f2a58d51c3714062a3bd42a7d0ae634bd56c220eb5c0ee91c09fa4eb462891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cookiecutter \
python39-cookiecutter \
python3dist-cookiecutter"

RDEPENDS:${PN} += "-python39-Jinja2 >= 2.7 with python39-Jinja2 < 4 \
-python39-click >= 7 with python39-click < 9 \
/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-PyYAML \
python39-binaryornot \
python39-future \
python39-jinja2-time \
python39-poyo \
python39-python-slugify \
python39-requests \
python39-whichcraft \
update-alternatives"

inherit rpm
