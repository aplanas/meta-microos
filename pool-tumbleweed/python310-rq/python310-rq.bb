SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "python310-rq-1.15-1.1.noarch.rpm"
RPM_HASH = "c0801bb4d216a5334b604f24a22ea05ecf62a0839100dc2e794cdf00c86cd8dc339511da1aeeb65bc5062d13328e919a1b82f02a54aacd8eabf533419675715d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rq \
python3.10dist-rq \
python310-rq \
python3dist-rq"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-redis \
update-alternatives"

inherit rpm
