SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python311-Whoosh-2.7.4-8.1.noarch.rpm"
RPM_HASH = "d1aa580820717cf4eac81625244780a97694bad71fb95f428117dc3a0c1610a943656b92debcbe1317cbbbfca51084ab0be3d522a888a516574ce6b1c79a49c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(whoosh) \
python311-Whoosh \
python3dist(whoosh)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
