SUMMARY = "Collection of Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a collection of persistent (disk-based) queues for Python. \
 \
Queuelib goals are speed and simplicity. It was originally part of the \
`Scrapy framework`_ and stripped out on its own library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python310-queuelib-1.6.2-1.8.noarch.rpm"
RPM_HASH = "2023fc8a40dba6a78166360514a684e0f368afcf3b5cc4005dc0e272de9850360aee8685f1b614086c24ef51e80cbf19a7f7867ae3b9f23849350d0aca4da6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-queuelib \
python3.10dist-queuelib \
python310-queuelib \
python3dist-queuelib"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
