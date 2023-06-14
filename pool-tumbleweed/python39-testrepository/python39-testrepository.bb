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

RPM_NAME = "python39-testrepository-0.0.20-10.1.noarch.rpm"
RPM_HASH = "567869ed2757d2f0314d24a2838291f4724fc5846af587740ddbc9967e811974a01b3935b0f4095a6be34413114282e14f6094cf5993b67900415018627628c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testrepository \
python39-testrepository \
python3dist-testrepository"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-dbm \
python39-extras \
python39-fixtures \
python39-python-subunit \
python39-testscenarios \
python39-testtools \
update-alternatives"

inherit rpm
