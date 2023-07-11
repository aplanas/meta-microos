SUMMARY = "Collection of Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a collection of persistent (disk-based) queues for Python. \
 \
Queuelib goals are speed and simplicity. It was originally part of the \
`Scrapy framework`_ and stripped out on its own library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python311-queuelib-1.6.2-1.10.noarch.rpm"
RPM_HASH = "e1c243365d82820774e80c9aede5b28ea9dde3924146903ac1f72d7668261c31f0da02918abf7082335912e663952e0b5a37447de82a0b6451f9afc15f006e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-queuelib \
python3.11dist-queuelib \
python311-queuelib \
python3dist-queuelib"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
