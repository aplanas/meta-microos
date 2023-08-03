SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python39-cookiecutter-2.2.3-1.1.noarch.rpm"
RPM_HASH = "26e19f3853c3538cf51efc947761e96fef08e8663dc59ec0eeda656fb96576f6d9778a85c9f3e42ca45b7f4a642866585ea1785412839049a55ba9e3c86ffda4"
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
