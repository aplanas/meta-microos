SUMMARY = "A least recently used (LRU) cache implementation"
DESCRIPTION = "Pylru implements a true LRU cache along with several support classes. The cache is efficient and written in pure Python. It works with Python 2.6+ including the 3.x series. Basic operations (lookup, insert, delete) all run in a constant amount of time. Pylru provides a cache class with a simple dict interface. It also provides classes to wrap any object that has a dict interface with a cache. Both write-through and write-back semantics are supported. Pylru also provides classes to wrap functions in a similar way, including a function decorator."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "python310-pylru-1.2.1-1.4.noarch.rpm"
RPM_HASH = "200e6d6ce9a43c8bf6a73da4e69a4641cebe5e75d823e6ca67a11fe636a93de5f76b2f731186644adfa5f1f5195d6132fb3068d13c86261fcc234ecf032119f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylru \
python310-pylru \
python3dist-pylru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
