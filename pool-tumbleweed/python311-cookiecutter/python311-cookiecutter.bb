SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python311-cookiecutter-2.1.1-2.1.noarch.rpm"
RPM_HASH = "b93430fc0cbac487a335a0ee8d4003ee8a60ec935a3828b6db039b2b8e7aa7b53fa413aa49366b591cd64c3494b1048a9f576c1f90396406fbedc8a3e8424243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cookiecutter \
python311-cookiecutter \
python3dist-cookiecutter"

RDEPENDS:${PN} += "-python311-Jinja2 >= 2.7 with python311-Jinja2 < 4 \
-python311-click >= 7 with python311-click < 9 \
/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-PyYAML \
python311-binaryornot \
python311-future \
python311-jinja2-time \
python311-poyo \
python311-python-slugify \
python311-requests \
python311-whichcraft \
update-alternatives"

inherit rpm
