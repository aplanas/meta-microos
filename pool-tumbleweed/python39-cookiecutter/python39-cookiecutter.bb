SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python39-cookiecutter-2.3.0-1.1.noarch.rpm"
RPM_HASH = "26d67e30495b3cca8faca2157c857209547903934234add878aa858b04dd47cc3f074a8cfdf2d8f4d0a6598e9afcef962e150d011702779f8f72b5f3b25a5834"
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
python39-arrow \
python39-binaryornot \
python39-python-slugify \
python39-requests \
python39-rich \
update-alternatives"

inherit rpm
