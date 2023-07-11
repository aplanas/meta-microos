SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python39-cooldict-1.04-1.16.noarch.rpm"
RPM_HASH = "84de0603b4bb97897276b5fbf8a181622db909e5503420da1518474246cc53bab9b0baee437b8496977daa9435715cfc4a74302120dd78a1dee2156dea972a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cooldict \
python39-cooldict \
python3dist-cooldict"

RDEPENDS:${PN} += "python-abi \
python39-ana"

inherit rpm
