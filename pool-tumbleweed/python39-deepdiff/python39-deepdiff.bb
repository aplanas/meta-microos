SUMMARY = "Deep Difference and Search of any Python object/data"
DESCRIPTION = "A Python module to calculate Deep Difference of dictionaries, \
iterables, strings and other objects. It can search for objects \
within other objects, and hash any object based on their content."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python39-deepdiff-6.3.0-2.3.noarch.rpm"
RPM_HASH = "743f3d06baf83d0ae04993503206343fcac5c9bea65126ed9bbc1a011439d1cf068a03cc54fcca70f820de7624d0ba6ce1005e14607b3db6fe40ebaa6fd048ec"
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
