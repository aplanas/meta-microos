SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "python310-rq-1.15-2.3.noarch.rpm"
RPM_HASH = "af0a6ae4c081b385135d5fc3b7450ebda5ea4cf91e041121838463dcd7ac6c057b549bf1e6855578886482c3271c784ff474826738c8ada860a538c6dc81018d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rq \
python310-rq \
python3dist-rq"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-redis \
update-alternatives"

inherit rpm
