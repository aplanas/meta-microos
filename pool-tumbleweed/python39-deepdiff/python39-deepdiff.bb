SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python39-deepdiff-6.3.0-1.1.noarch.rpm"
RPM_HASH = "e31d67685fa04829c4d4a88724ba45d0ab47f21280afbc25461b65b410270cc4392f4e5a842830d0f55c41854f1d5e51a6fbc63e6d69eddcae29d1e595c02a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-deepdiff \
python39-deepdiff \
python3dist-deepdiff"

RDEPENDS:${PN} += "-python39-ordered-set >= 4.1.0 with python39-ordered-set < 4.2 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
