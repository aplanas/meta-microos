SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python39-unidiff-0.7.4-1.7.noarch.rpm"
RPM_HASH = "eda193a5f9b51ce5c81881501eb3d980ca282f184efc367023c2ef58d3c643caa8254beef6bd12233d2a0946722de819471ccbc7fcc87aeaea4c9c4ccd68bfe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unidiff \
python39-unidiff \
python3dist-unidiff"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
