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

RPM_NAME = "python310-sortedcollections-2.1.0-1.12.noarch.rpm"
RPM_HASH = "ea954ea9ae7e08da636509c84ed874a7e19d918551f8f4ac0abb137ec1ffee80f4b786d448cc6e8f1457c39cf876fa903f3301034f4d360f830e20f891eb5737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sortedcollections \
python310-sortedcollections \
python3dist-sortedcollections"

RDEPENDS:${PN} += "python-abi \
python310-sortedcontainers"

inherit rpm
