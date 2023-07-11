SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "python311-rq-1.15-2.3.noarch.rpm"
RPM_HASH = "7cd0d069d7afbb7bd35ed93485c7d85980c3fd09bf33593617c31e81f1ff36324eeac1bdfa99b9308565cc681514faa499e3999fdc030e831b74e532d43e3473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rq \
python3.11dist-rq \
python311-rq \
python3dist-rq"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-redis \
update-alternatives"

inherit rpm
