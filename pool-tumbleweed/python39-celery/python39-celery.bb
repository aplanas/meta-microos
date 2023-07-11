SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python39-celery-5.2.7-4.2.noarch.rpm"
RPM_HASH = "73af64934886780fb033f499fd6ada1d3f7abf67abc5bede63cddfa718fc83eb893427851ba173cb762a8e68db8e7bf939271fd5a88044154ec5d9ed34f616aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-celery \
python39-celery \
python3dist-celery"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-billiard \
python39-click \
python39-click-didyoumean \
python39-click-plugins \
python39-click-repl \
python39-kombu \
python39-pytz \
python39-vine \
update-alternatives"

inherit rpm
