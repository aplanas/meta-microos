SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python39-fusepy-3.0.1-2.15.noarch.rpm"
RPM_HASH = "ae26046e3f1bca483a02ad3f549cf1374a3b736409df7e1a378ef1f64f92a7c87c1f59b353cbe45d8254fa48d3538343442261626cb5ff724e0457a9b46a3ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fusepy \
python39-fusepy \
python3dist-fusepy"

RDEPENDS:${PN} += "libfuse2 \
python-abi"

inherit rpm
