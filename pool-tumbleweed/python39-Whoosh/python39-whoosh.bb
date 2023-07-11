SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python39-Whoosh-2.7.4-8.3.noarch.rpm"
RPM_HASH = "bd3510e9017dbfdf831fdc107be44a110cdca89aa9fa02ef0ad80f3cb53632e0e9ff20a1dfe6e657d4ff94d0cc692db1dac66d1a7a0e314958e69a4ff06c3309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whoosh \
python39-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
