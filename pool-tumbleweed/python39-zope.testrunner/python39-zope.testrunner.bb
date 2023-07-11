SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.testrunner-6.0-2.3.noarch.rpm"
RPM_HASH = "713a3ddb667795d161856bb0a1d7478ab5329370b8dea2ffcc26b16652b83513cf85863fe85d685e7809029c4e862164fd6a2fcfe05536fe14d95fdfdf233cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.testrunner \
python39-zope.testrunner \
python3dist-zope.testrunner"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-zope.exceptions \
python39-zope.interface \
update-alternatives"

inherit rpm
