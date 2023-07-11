SUMMARY = "Python Sorted Collections"
DESCRIPTION = "SortedCollections is an Python sorted collections library. \
 \
Features \
-------- \
 \
- ValueSortedDict - Dictionary with (key, value) item pairs sorted by value. \
- ItemSortedDict - Dictionary with key-function support for item pairs. \
- OrderedDict - Ordered dictionary with numeric indexing support. \
- OrderedSet - Ordered set with numeric indexing support. \
- IndexableDict - Dictionary with numeric indexing support. \
- IndexableSet - Set with numeric indexing support. \
- SegmentList - List with fast random access insertion and deletion."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-sortedcollections-2.1.0-1.12.noarch.rpm"
RPM_HASH = "028aee74250c46b8107d06318339bc7eb431d5e78dea93ee87a79dc6a80dbc9fb6265adeaaab530a5e9e4e5697a3b654682b3650da7611960dc6383e2e9e3489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sortedcollections \
python3.11dist-sortedcollections \
python311-sortedcollections \
python3dist-sortedcollections"

RDEPENDS:${PN} += "python-abi \
python311-sortedcontainers"

inherit rpm
