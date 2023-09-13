SUMMARY = "A command-line utility that creates projects from project templates"
DESCRIPTION = "A command-line utility that creates projects from cookiecutters (project \
templates), e.g. creating a Python package project from a Python package \
project template. \
 \
Project templates can be in any programming language or markup format."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python310-cookiecutter-2.3.0-1.1.noarch.rpm"
RPM_HASH = "a170f3c9ca90be667a918a1fe0fd40c15e597bb79c647da6163b267df22a4ffb87f1ad071722a72d707e142112d8e90697d713e38ef8fe134490b20c985f7ba3"
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
python310-arrow \
python310-binaryornot \
python310-python-slugify \
python310-requests \
python310-rich \
update-alternatives"

inherit rpm
