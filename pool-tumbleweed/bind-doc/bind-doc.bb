SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-doc-9.18.16-3.1.noarch.rpm"
RPM_HASH = "e1a22c61d62c16b97a3f8529b97c45defac1b568a1cc2e326c5efc94ec00fff96fd8c81c488fbdc7a6de9ba44912d0a7db3c6eee65019740acdbb314b9753905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"

RDEPENDS:${PN} += ""

inherit rpm
