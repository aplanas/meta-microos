SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python310-cooldict-1.04-1.16.noarch.rpm"
RPM_HASH = "6e7a8a1e91eed914b47ca4e9fd0cb5e0680ee665244b37db9a20e7850dbe9cc5ab0dd45007b0447cd19d3490bb33541757832f8c5816cc62f54a61831c34fdfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cooldict \
python310-cooldict \
python3dist-cooldict"

RDEPENDS:${PN} += "python-abi \
python310-ana"

inherit rpm
