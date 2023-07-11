SUMMARY = "Documentation for python-Whoosh"
DESCRIPTION = "Whoosh is a pure-Python indexing and search library. It can be used \
to add search functionality to applications and websites. Every part \
of how Whoosh works can be extended or replaced to meet specific \
needs. \
 \
This package contains the documentation."
LICENSE = "BSD-2-Clause"

PV = "2.7.4"

RPM_NAME = "python-Whoosh-doc-2.7.4-8.3.noarch.rpm"
RPM_HASH = "49f2051780b7a1b5e5d1e9cb1f094fac7345b25d541ad2cdc5f14de55d4a582665c9faed96eb727554b36538b4c5e70a4ac0729e3e19e8be286ea6de0b322017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Whoosh-doc \
python310-Whoosh-doc \
python311-Whoosh-doc \
python39-Whoosh-doc"

RDEPENDS:${PN} += ""

inherit rpm
