SUMMARY = "GNU Data Access (GDA) Library -- Developer Documentation"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-doc-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "55fed8f7a97f5a94e778700ade6cd28a43821bcc0362204de0651cbd075dc067210f1bc5ba0df4c69702e613ad4aff387b2496cc5e80dc70c1313f4027b353a6"

RPROVIDES:${PN} += "libgda-6_0-doc \
libgda-6_0-doc(aarch-64) \
libgda-doc"

RDEPENDS:${PN} += ""

inherit rpm
