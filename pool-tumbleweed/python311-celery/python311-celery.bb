SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python311-celery-5.2.7-4.2.noarch.rpm"
RPM_HASH = "a86ba9ebca6f211478e716ea919c8381e498aecd7e73b99495e6d98076dd299cf9f53d29a42f0c2154a8ab88d5eb0f5a0f0127b2149c8e83dd922426bcb8f378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery \
python3.11dist-celery \
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
