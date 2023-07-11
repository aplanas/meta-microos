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

RPM_NAME = "python39-sortedcollections-2.1.0-1.12.noarch.rpm"
RPM_HASH = "83dcd2cd9abd7ab440a2d3231fe7d01ab33ad20ef2f142ca3f55f27e2d246a50788de37c8bd5add3d4afaa571380bef6af7bf308f04f52456b02d482f67afd1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sortedcollections \
python39-sortedcollections \
python3dist-sortedcollections"

RDEPENDS:${PN} += "python-abi \
python39-sortedcontainers"

inherit rpm
