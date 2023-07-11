SUMMARY = "Collection of Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a collection of persistent (disk-based) queues for Python. \
 \
Queuelib goals are speed and simplicity. It was originally part of the \
`Scrapy framework`_ and stripped out on its own library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python39-queuelib-1.6.2-1.10.noarch.rpm"
RPM_HASH = "4bfb8b1175abb73c632e4fc4725be832b60e945f6e4f87c3c623ba0e86c6c8d97a9aafe9e2757839d5310a5b108a15279492f99e1bd870ed3627e9e5857c962c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-queuelib \
python39-queuelib \
python3dist-queuelib"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
