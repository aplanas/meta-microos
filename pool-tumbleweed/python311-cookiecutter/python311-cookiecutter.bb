SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-cookiecutter-2.3.0-1.1.noarch.rpm"
RPM_HASH = "2efdca9abb72b75a3e394b3dde4377ec5b387ba6d2e50fb36b03637cc23a6123ebcb343288e95e3ff1ace29603741655dcc2f56841d1b1cc44c29678800c5032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cookiecutter \
python3-cookiecutter \
python3.11dist-cookiecutter \
python311-cookiecutter \
python3dist-cookiecutter"

RDEPENDS:${PN} += "-python311-Jinja2 >= 2.7 with python311-Jinja2 < 4 \
-python311-click >= 7 with python311-click < 9 \
/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-PyYAML \
python311-arrow \
python311-binaryornot \
python311-python-slugify \
python311-requests \
python311-rich \
update-alternatives"

inherit rpm
