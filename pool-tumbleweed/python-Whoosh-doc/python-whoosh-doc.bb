SUMMARY = "Documentation for python-Whoosh"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs. \
 \
This package contains the documentation."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python-Whoosh-doc-2.7.4-9.1.noarch.rpm"
RPM_HASH = "22af7800076ff3ffbc64c2d42e0408cbad7ac625ab98deded32a605bf60839a3be3a379ae202e973031333c713ed50e93100664d760a80552bbc8e812b3ca6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Whoosh-doc \
python310-Whoosh-doc \
python311-Whoosh-doc \
python39-Whoosh-doc"

RDEPENDS:${PN} += ""

inherit rpm
