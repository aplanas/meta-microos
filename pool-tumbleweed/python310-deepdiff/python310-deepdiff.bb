SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python310-deepdiff-6.3.0-2.3.noarch.rpm"
RPM_HASH = "5b637cbbb67e72310bb4b91c4bd9c5b2eafb3cf9940dd2f977459616632201c30e3690c7bd4b04527c9edbb54db4a98d4d568e12cde6e680d7e2b3d1098ac28b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-deepdiff \
python310-deepdiff \
python3dist-deepdiff"

RDEPENDS:${PN} += "-python310-ordered-set >= 4.1.0 with python310-ordered-set < 4.2 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
