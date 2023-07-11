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

RPM_NAME = "python39-testrepository-0.0.20-10.3.noarch.rpm"
RPM_HASH = "b641c3b310358ae6175752e0e74321e77684cc1665d0450500184c01fedf78f2f73898e40b6fa4c1bbf61d9a5b5d14b020ef52f63779cc68360619b820a0862b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testrepository \
python39-testrepository \
python3dist-testrepository"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dbm \
python39-extras \
python39-fixtures \
python39-python-subunit \
python39-testscenarios \
python39-testtools \
update-alternatives"

inherit rpm
