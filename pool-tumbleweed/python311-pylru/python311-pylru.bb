SUMMARY = "A least recently used (LRU) cache implementation"
DESCRIPTION = "Pylru implements a true LRU cache along with several support classes. The cache is efficient and written in pure Python. It works with Python 2.6+ including the 3.x series. Basic operations (lookup, insert, delete) all run in a constant amount of time. Pylru provides a cache class with a simple dict interface. It also provides classes to wrap any object that has a dict interface with a cache. Both write-through and write-back semantics are supported. Pylru also provides classes to wrap functions in a similar way, including a function decorator."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "python311-pylru-1.2.1-1.4.noarch.rpm"
RPM_HASH = "f2fafdf0713f1c54332026ba299453d934ad91a8f2a05d5cf4e96dbd4c8586ecbba2cd53458a5a07659a837969739de87dfe4b43c12d90c3011c531927c41cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylru \
python3.11dist-pylru \
python311-pylru \
python3dist-pylru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
