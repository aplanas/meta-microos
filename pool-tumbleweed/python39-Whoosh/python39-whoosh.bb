SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python39-Whoosh-2.7.4-9.1.noarch.rpm"
RPM_HASH = "5c5a7a62b96f007b61cbb5a0478ad45d7e5058bc425417cbe597e6cacc13bade1253c8d0d75a2444ef4c3a3865849aedb8cb11c658c320cdb040f1bdce3f4671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whoosh \
python39-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
