SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "python39-rq-1.15-2.3.noarch.rpm"
RPM_HASH = "47e891079b68463d58c70e861910a8262844e4602a3e90fea3dd717ce5893f8bef5ecdab059bfdc4b93099a75dfbc7cc4d87e36cea0f266224685dbffccb9f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rq \
python39-rq \
python3dist-rq"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-redis \
update-alternatives"

inherit rpm
