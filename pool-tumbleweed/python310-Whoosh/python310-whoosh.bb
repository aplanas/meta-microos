SUMMARY = "Pure-Python full text indexing, search, and spell checking library"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python310-Whoosh-2.7.4-9.1.noarch.rpm"
RPM_HASH = "b3dca8cdc8ca66838d248c64b6e1513f68bac7ddde2a9ea3469ccc20848cc14786eb0da678b474e710d5d3b16a49ec878babe9d18cadf6f75b161f99ea5110ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whoosh \
python310-Whoosh \
python3dist-whoosh"

RDEPENDS:${PN} += "python-abi"

inherit rpm
