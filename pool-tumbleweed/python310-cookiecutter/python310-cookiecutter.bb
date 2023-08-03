SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "python310-cookiecutter-2.2.3-1.1.noarch.rpm"
RPM_HASH = "f239935e80fdb8afa102e896576d37c05be5ca624b4a377422da873a16f292a28b27021d9c1744605b00343d1b0381be7282677bbf33f1b43adf534eba0b1a6d"
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
