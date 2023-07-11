SUMMARY = "Security oriented static analyser for Python code"
DESCRIPTION = "Bandit is a tool designed to find common security issues in Python code. To do \
this Bandit processes each file, builds an AST from it, and runs appropriate \
plugins against the AST nodes. Once Bandit has finished scanning all the files \
it generates a report."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "python3-bandit-1.7.4-2.5.noarch.rpm"
RPM_HASH = "787db1f792e126b1696253dd1079f882eb1f896220ecd1fad0fe5cf760c08c02d36a9a7f33e377247ffee73f93a79ab9b9c6980e2ba2b0c26d7333ac6d733013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bandit \
python3.11dist-bandit \
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
