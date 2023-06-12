SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python311-deepdiff-6.3.0-1.1.noarch.rpm"
RPM_HASH = "ca2b7294272579039ff5d3d692b235714253fdd4db7c44e4160b41712656679e7a681e1c5d1624087a61514e3c03198d6a27237f3ec24bebec3eb02ed4fc4dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(deepdiff) \
python311-deepdiff \
python3dist(deepdiff)"
RDEPENDS:${PN} += "(python311-ordered-set >= 4.1.0 with python311-ordered-set < 4.2) \
/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
