SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python39-intervaltree-3.1.0-1.6.noarch.rpm"
RPM_HASH = "59b571ecaab8c7d06078b5fabff4e9fc8ee5795c1591b900c6d160c04b996b76b568ec04c943d1453b83cd03dc27d874850364a8bd65c4291659735b7f70f6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-intervaltree \
python39-intervaltree \
python3dist-intervaltree"

RDEPENDS:${PN} += "python-abi \
python39-sortedcontainers"

inherit rpm
