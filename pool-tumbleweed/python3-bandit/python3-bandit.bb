SUMMARY = "Security oriented static analyser for Python code"
DESCRIPTION = "Bandit is a tool designed to find common security issues in Python code. To do \
this Bandit processes each file, builds an AST from it, and runs appropriate \
plugins against the AST nodes. Once Bandit has finished scanning all the files \
it generates a report."
LICENSE = "Apache-2.0"

PV = "1.7.5"

RPM_NAME = "python3-bandit-1.7.5-1.1.noarch.rpm"
RPM_HASH = "73a5d96346f515c93f4b4319cb680e13436cd43173eee5ffb866854dd58bd6f8ebccc1f7cc206b9d12bf5536ffe681753b6d51aecbb43486def86f478bd2023f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bandit \
python3.11dist-bandit \
python3dist-bandit"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-GitPython \
python3-PyYAML \
python3-rich \
python3-stestr \
python3-stevedore \
update-alternatives"

inherit rpm
