SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python310-deepdiff-6.3.0-1.1.noarch.rpm"
RPM_HASH = "f45dfcc8a0982d4d2d7e41d169244cb4739118d28a39a639f0f4317c5dffa33c74da65baca09733a2a5cc54f17c3773fcb6d295806c09e31683d2b8428bef4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepdiff \
python3.10dist(deepdiff) \
python310-deepdiff \
python3dist(deepdiff)"

RDEPENDS:${PN} += "(python310-ordered-set >= 4.1.0 with python310-ordered-set < 4.2) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
