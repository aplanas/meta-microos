SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python311-Whoosh-2.7.4-9.1.noarch.rpm"
RPM_HASH = "11885b84389dbc86819816e032ec889714db18d69be44335f13147c4a1813b28422a29bc4cc554f396944384000a60abeae6f8ad3b4ebebc5d676e7feeba25ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Whoosh \
python3.11dist-whoosh \
python311-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
