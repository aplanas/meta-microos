SUMMARY = "A least recently used (LRU) cache implementation"
DESCRIPTION = "Pylru implements a true LRU cache along with several support classes. The cache is efficient and written in pure Python. It works with Python 2.6+ including the 3.x series. Basic operations (lookup, insert, delete) all run in a constant amount of time. Pylru provides a cache class with a simple dict interface. It also provides classes to wrap any object that has a dict interface with a cache. Both write-through and write-back semantics are supported. Pylru also provides classes to wrap functions in a similar way, including a function decorator."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "python39-pylru-1.2.1-1.4.noarch.rpm"
RPM_HASH = "4992fcb7f5a704ebe929dc75209074f028576503e1e89ca9227bb6fed319a27c6d548112b34de2fe0456133f144115664d967e3f862f8cb809bb01cd007bc3fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylru \
python39-pylru \
python3dist-pylru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
