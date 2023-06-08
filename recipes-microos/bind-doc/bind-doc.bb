SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-doc-9.18.14-1.1.noarch.rpm"
RPM_HASH = "d880d11e27c7c5399cee65e5ada6a091a185583b1598a15521c6a0c9065333d402c76f1d58126a4884c666880c135f042f1ebefd996852e7b0105a337e050079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"
RDEPENDS:${PN} += ""

inherit rpm
