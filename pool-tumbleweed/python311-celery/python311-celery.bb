SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python311-celery-5.2.7-3.1.noarch.rpm"
RPM_HASH = "8184d77ea1ef42645ff8fbcd8b156f68955889ca1f09dfc49d63c408eae72c83029aed367c62a829bc524ed84b706e089efc625e6608a2c5b19c2751c1928696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-celery \
python311-celery \
python3dist-celery"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-billiard \
python311-click \
python311-click-didyoumean \
python311-click-plugins \
python311-click-repl \
python311-kombu \
python311-pytz \
python311-vine \
update-alternatives"

inherit rpm
