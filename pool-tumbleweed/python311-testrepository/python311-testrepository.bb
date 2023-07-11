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

RPM_NAME = "python311-testrepository-0.0.20-10.3.noarch.rpm"
RPM_HASH = "04b03abf7fb0f05c35e7e0cfcfd6883112e9ee231c7d3d05ed473699fb094641d8ada376dc3c65b5880d08df5b97dc4538f305060a8aca85bfece1d15e7aab19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testrepository \
python3.11dist-testrepository \
python311-testrepository \
python3dist-testrepository"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dbm \
python311-extras \
python311-fixtures \
python311-python-subunit \
python311-testscenarios \
python311-testtools \
update-alternatives"

inherit rpm
