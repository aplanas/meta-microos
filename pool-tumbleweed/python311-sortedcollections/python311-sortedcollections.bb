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

RPM_NAME = "python311-sortedcollections-2.1.0-1.10.noarch.rpm"
RPM_HASH = "b51b461a682ee24b68d29e3e9c647211523c07fff6cb5b1fd7369a85572edff5d5bd45e3829d0dbe6086a48c95e98b615365c378e9295f4458fdd955aa1ed6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sortedcollections) \
python311-sortedcollections \
python3dist(sortedcollections)"

RDEPENDS:${PN} += "python(abi) \
python311-sortedcontainers"

inherit rpm
