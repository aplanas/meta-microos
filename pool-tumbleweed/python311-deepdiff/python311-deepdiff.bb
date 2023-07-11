SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python311-deepdiff-6.3.0-2.3.noarch.rpm"
RPM_HASH = "51923c13cc74385c8f8356d0a4f182849ffbcaff6d423809b808ecb0f0a82e6be14b931c80c580c38e49b2fcc1784ba6a5dbce49cdde46007722ec78c9be82a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-deepdiff \
python3.11dist-deepdiff \
python311-deepdiff \
python3dist-deepdiff"

RDEPENDS:${PN} += "-python311-ordered-set >= 4.1.0 with python311-ordered-set < 4.2 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
