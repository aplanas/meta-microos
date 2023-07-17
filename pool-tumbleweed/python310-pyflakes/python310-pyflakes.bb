SUMMARY = "Passive checker of Python programs"
DESCRIPTION = "Pyflakes is program to analyze Python programs and detect various errors. It \
works by parsing the source file, not importing it, so it is safe to use on \
modules with side effects. It's also much faster."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-pyflakes-3.0.1-5.1.noarch.rpm"
RPM_HASH = "0e3a34bfee819835b684f9ff3f444699294d4e14d8518b21da3750785d30ff6414594a4ac5b51b67bd9b4bee2e23dc4b8537ab9a67a3fb3a36628167bba66664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyflakes \
python310-pyflakes \
python3dist-pyflakes"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
