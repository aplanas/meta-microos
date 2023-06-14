SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python39-Whoosh-2.7.4-8.1.noarch.rpm"
RPM_HASH = "a79ff4c5dff52f8e678de50455e7663da6e24e32816f8c9505f414a22d412946d2df6936f09f3bf4cb957badd2e8578e68abc458aac8378739f9c3c110c32429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whoosh \
python39-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
