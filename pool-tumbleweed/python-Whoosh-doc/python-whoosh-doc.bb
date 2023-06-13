SUMMARY = "Documentation for python-Whoosh"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs. \
 \
This package contains the documentation."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python-Whoosh-doc-2.7.4-8.1.noarch.rpm"
RPM_HASH = "d81dcd0d891b76f018c96c6d963633651b222402f1c542152cf6a1b95eef73de0b6df20a8f89092c5416929fc0e1a673c7fa704b4bda1666c7ee51becde86c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Whoosh-doc \
python310-Whoosh-doc \
python311-Whoosh-doc \
python39-Whoosh-doc"

RDEPENDS:${PN} += ""

inherit rpm
