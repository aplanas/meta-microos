SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python310-intervaltree-3.1.0-1.6.noarch.rpm"
RPM_HASH = "7056744327d4af8a8fd4f55f083a67f87dc834e2739ea41d428d77819b7c43c34a2bd2f9074e9e7a2450f26db71d01e2fb05fdc1d6319e22fa2d118b8b9cd577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-intervaltree \
python310-intervaltree \
python3dist-intervaltree"

RDEPENDS:${PN} += "python-abi \
python310-sortedcontainers"

inherit rpm
