SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "python311-rq-1.15-1.1.noarch.rpm"
RPM_HASH = "e6f67fc42c5d6244b951477b4b38c47ae43adac8235162b5977ea86d36a8b1e656c8afed834ded414ffda2f2f33005eba99ca90bbe1ebcc171c8ac4902af705d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rq) \
python311-rq \
python3dist(rq)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-click \
python311-redis \
update-alternatives"

inherit rpm
