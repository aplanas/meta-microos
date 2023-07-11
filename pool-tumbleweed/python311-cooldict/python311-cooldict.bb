SUMMARY = "dict-like structures for Python"
DESCRIPTION = "cooldict provides some dict-like structures for Python, such as \
* a write-through cache around another dict \
* a finalizable dict \
* a branching dict \
* a copy-on-write dict (with and without sinkholing capability)"
LICENSE = "BSD-2-Clause"

PV = "1.04"

RPM_NAME = "python311-cooldict-1.04-1.16.noarch.rpm"
RPM_HASH = "fd0ffead01e5e4e5f24f6cd1c9c8442fea31de512c37cebea5dbb92b2bd63da2ce210b6cf13f740efbb7e39075685f457c59a1aedb3da47a6ed5d53dd2998741"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cooldict \
python3.11dist-cooldict \
python311-cooldict \
python3dist-cooldict"

RDEPENDS:${PN} += "python-abi \
python311-ana"

inherit rpm
