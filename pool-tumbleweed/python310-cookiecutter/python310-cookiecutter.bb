SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python310-cookiecutter-2.1.1-2.2.noarch.rpm"
RPM_HASH = "85ebafcb6fc0cb89fc023d0d8f7fd9b5aa323b6bc4b8f866c2bf699ba9b15ffa5453e575444bee3163e7262565ea1490feee30b4b4bf04ec578d01575262ed59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cookiecutter \
python310-cookiecutter \
python3dist-cookiecutter"

RDEPENDS:${PN} += "-python310-Jinja2 >= 2.7 with python310-Jinja2 < 4 \
-python310-click >= 7 with python310-click < 9 \
/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-PyYAML \
python310-binaryornot \
python310-future \
python310-jinja2-time \
python310-poyo \
python310-python-slugify \
python310-requests \
python310-whichcraft \
update-alternatives"

inherit rpm
