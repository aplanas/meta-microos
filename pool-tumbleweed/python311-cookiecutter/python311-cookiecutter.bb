SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.1.1"

RPM_NAME = "python311-cookiecutter-2.1.1-2.2.noarch.rpm"
RPM_HASH = "2e9d89b436ae7d0bd9427bd7d86a23bce263d910b7e221c1683db62d8c2139f5b9afde368002a4b221d52b8f9fb8df59ea60623386407c56e631e37d2231aef8"
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
python311-binaryornot \
python311-future \
python311-jinja2-time \
python311-poyo \
python311-python-slugify \
python311-requests \
python311-whichcraft \
update-alternatives"

inherit rpm
