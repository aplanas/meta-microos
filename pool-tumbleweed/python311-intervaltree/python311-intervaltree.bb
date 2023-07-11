SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python311-intervaltree-3.1.0-1.6.noarch.rpm"
RPM_HASH = "bfcd5c28035e21f6cfca1df4affa0b2998e31aed1692358fbe45cd3d06795070e91ecad3abadb56fc15dc9fa18b20c41c136285e0f0c4f5e1ce72bd539150acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-intervaltree \
python3.11dist-intervaltree \
python311-intervaltree \
python3dist-intervaltree"

RDEPENDS:${PN} += "python-abi \
python311-sortedcontainers"

inherit rpm
