SUMMARY = "A repository of test results"
DESCRIPTION = "This project provides a database of test results which can be used as part of \
developer workflow to ensure/check things like: \
 \
* No commits without having had a test failure, test fixed cycle. \
* No commits without new tests being added. \
* What tests have failed since the last commit (to run just a subset). \
* What tests are currently failing and need work. \
 \
Test results are inserted using subunit (and thus anything that can output \
subunit or be converted into a subunit stream can be accepted)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.0.20"

RPM_NAME = "python310-testrepository-0.0.20-10.1.noarch.rpm"
RPM_HASH = "c653cefc6e06b366cdc2fa663426e2ba913931fc7d440da652a6c341554312c3a591bdb02bd027571233e3b1eea06a29576195d0e0e2d0cc34f8ca1c46968013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testrepository \
python3.10dist(testrepository) \
python310-testrepository \
python3dist(testrepository)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-dbm \
python310-extras \
python310-fixtures \
python310-python-subunit \
python310-testscenarios \
python310-testtools \
update-alternatives"

inherit rpm
