SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python311-Whoosh-2.7.4-8.3.noarch.rpm"
RPM_HASH = "1d216eff57c6fa92acbbefe15640ccc6e72852ef23b11865349a37bfcc7506a449f37d01cd17aa14664b47e1c3978ba0bcaff928b920759408a919da3362bc56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Whoosh \
python3.11dist-whoosh \
python311-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
