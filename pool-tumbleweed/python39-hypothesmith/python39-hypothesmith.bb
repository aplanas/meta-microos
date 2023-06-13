SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.2.3"

RPM_NAME = "python39-hypothesmith-0.2.3-2.1.noarch.rpm"
RPM_HASH = "4e9f42f2c2d7a4ba7694c476961d93aff11760166809643a8eedfd06d8ea52bf8a3b016c23d4b944e3ff0b5f40859b549ae93985e9e1e97168d233c323e543f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hypothesmith) \
python39-hypothesmith \
python3dist(hypothesmith)"

RDEPENDS:${PN} += "python(abi) \
python39-base \
python39-hypothesis \
python39-lark \
python39-libcst"

inherit rpm
