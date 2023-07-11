SUMMARY = "Python unittest helpers"
DESCRIPTION = "evilunit provides helpers for Python unittest, \
including class level imports, parameterized tests \
and nested test classes."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-evilunit-0.2.1-1.14.noarch.rpm"
RPM_HASH = "63befc394d6aaf24c2dc9bc579edb5477747eac80072e5a011d25b8a733bfae8c5f7699498fe919120d2ae799e5f148a04460caed63000a4c38ccd0c1df144db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-evilunit \
python39-evilunit \
python3dist-evilunit"

RDEPENDS:${PN} += "python-abi \
python39-setuptools"

inherit rpm
