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

RPM_NAME = "python310-testrepository-0.0.20-10.3.noarch.rpm"
RPM_HASH = "9b94ec41c5cb13f4fc879f20908b9d4092ecea2f92f530ff32d4d373c6823257bb8eaaf8b0e73717b27977c63c58a955d1472b9dbaff41f01f130cce2056ad9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testrepository \
python310-testrepository \
python3dist-testrepository"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dbm \
python310-extras \
python310-fixtures \
python310-python-subunit \
python310-testscenarios \
python310-testtools \
update-alternatives"

inherit rpm
