SUMMARY = "Editable interval tree data structure for Python"
DESCRIPTION = "A mutable, self-balancing interval tree for Python 2 and 3. Queries may \
be by point, by range overlap, or by range envelopment. \
 \
This library was designed to allow tagging text and time intervals, \
where the intervals include the lower bound but not the upper bound."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python311-intervaltree-3.1.0-1.4.noarch.rpm"
RPM_HASH = "5cee8c0b083036b6274b7c2279fdc8378f7920e5d82d7529ef47bd6eb01e78d21effacb80d9c9fe12ab43bebec0a88521cdaed55e5686525695a295d5dac279d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(intervaltree) \
python311-intervaltree \
python3dist(intervaltree)"

RDEPENDS:${PN} += "python(abi) \
python311-sortedcontainers"

inherit rpm
