SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python311-cookiecutter-2.2.3-1.1.noarch.rpm"
RPM_HASH = "d942e57d3cf1321ec5c5ce1bd5b296e2b07c0bf16c787e8851d4763a7fd2550437450179a66915105cc1536a57a2bb088cb545a07baaba3b5c40cfcc91d0fadc"
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
