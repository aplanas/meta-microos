SUMMARY = "Collection of Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a collection of persistent (disk-based) queues for Python. \
 \
Queuelib goals are speed and simplicity. It was originally part of the \
`Scrapy framework`_ and stripped out on its own library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python311-queuelib-1.6.2-1.8.noarch.rpm"
RPM_HASH = "c57f2b0a729f917db0619a43fe89ec3613e1b0bb6a4b01d4fedbd129f6a179d4f001aba4add327f44405a082ad798a6c235675f2de3df18d79675e8a094b85f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(queuelib) \
python311-queuelib \
python3dist(queuelib)"

RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm
