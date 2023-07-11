SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python310-celery-5.2.7-4.2.noarch.rpm"
RPM_HASH = "b02add01ad9acaed13ec53957fe614e89af587e30f1200db86522f53c21991471bda51724191fbb7050c9bc31b66efa587b35f414aa4191ba33b85ab0d880694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-celery \
python310-celery \
python3dist-celery"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-billiard \
python310-click \
python310-click-didyoumean \
python310-click-plugins \
python310-click-repl \
python310-kombu \
python310-pytz \
python310-vine \
update-alternatives"

inherit rpm
