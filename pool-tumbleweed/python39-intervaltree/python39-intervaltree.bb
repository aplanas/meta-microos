SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python39-intervaltree-3.1.0-1.4.noarch.rpm"
RPM_HASH = "4e04aa9a565b39bb11b2dde047625b5e233a62244557453f0c72c2629845a55b1c5708b50761c6634c46f84f84190481d4cfa08d741fc2ffd78370816c3fbbcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-intervaltree \
python39-intervaltree \
python3dist-intervaltree"

RDEPENDS:${PN} += "python-abi \
python39-sortedcontainers"

inherit rpm
