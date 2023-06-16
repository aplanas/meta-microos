SUMMARY = "Security oriented static analyser for Python code"
DESCRIPTION = "Bandit is a tool designed to find common security issues in Python code. To do \
this Bandit processes each file, builds an AST from it, and runs appropriate \
plugins against the AST nodes. Once Bandit has finished scanning all the files \
it generates a report."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python3-bandit-1.7.4-2.4.noarch.rpm"
RPM_HASH = "9fa810e390e89e9899105929874f2e55f61f02cb7939e1150a8e446875b340832ca4a1a41b243ca54e3ced826804aa11a46f3a0aeecd5601b593e96296de7055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bandit \
python3.10dist-bandit \
python3dist-bandit"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-GitPython \
python3-PyYAML \
python3-stestr \
python3-stevedore \
python3-toml \
update-alternatives"

inherit rpm
