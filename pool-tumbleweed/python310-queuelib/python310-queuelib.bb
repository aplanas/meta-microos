SUMMARY = "Collection of Persistent (Disk-Based) Queues"
DESCRIPTION = "Queuelib is a collection of persistent (disk-based) queues for Python. \
 \
Queuelib goals are speed and simplicity. It was originally part of the \
`Scrapy framework`_ and stripped out on its own library."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "python310-queuelib-1.6.2-1.10.noarch.rpm"
RPM_HASH = "091b2c3c1a0a104e45abcd2a95b1adc822c723c68ccb13e80981cd9b7b0fd6240689c449c4bad60446e23789cf560e872644be4c7b642b2ed423db95f61b7485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-queuelib \
python310-queuelib \
python3dist-queuelib"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
