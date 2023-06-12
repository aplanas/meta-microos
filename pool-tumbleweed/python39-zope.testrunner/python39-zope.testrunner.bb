SUMMARY = "Zope testrunner script"
DESCRIPTION = "This package provides a flexible test runner with layer support."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python39-zope.testrunner-6.0-1.1.noarch.rpm"
RPM_HASH = "c6ad1e4818fa555e56eeb8ea7fd526964fa09e575bdffb769aa932b450bacd01c8de3e2accb122a6b6f45c0fae7434fae82ee481076bca4b253ef998fcde20bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.testrunner) \
python39-zope.testrunner \
python3dist(zope.testrunner)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-zope.exceptions \
python39-zope.interface \
update-alternatives"

inherit rpm
