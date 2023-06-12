SUMMARY = "Easy Job Queues for Python"
DESCRIPTION = "RQ (Redis Queue) is a simple Python library for queueing jobs and processing \
them in the background with workers. It is backed by Redis. It can be \
integrated into web stacks."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "python39-rq-1.15-1.1.noarch.rpm"
RPM_HASH = "96e585fdaf50576bdea3e0a5d08bfcc19557748a5b639c6ff81a86e8a950561a73722914de77c99230e746a1fbe7cbabb7d7b6fa9f09bf6da5f8b063ccb70a4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rq) \
python39-rq \
python3dist(rq)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
python39-redis \
update-alternatives"

inherit rpm
