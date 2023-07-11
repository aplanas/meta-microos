SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python310-Whoosh-2.7.4-8.3.noarch.rpm"
RPM_HASH = "dfb1691f4bd1a3aa806d05a4dbac7e78434060b23f7b861f418cf492b5436f50ee7613509737818c2db736a0f400b383e26c3eae0a3611c60f10843b5a16d956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whoosh \
python310-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
