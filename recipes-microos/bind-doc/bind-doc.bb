SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-doc-9.18.15-1.1.noarch.rpm"
RPM_HASH = "05dba5e72a933a4dbf1be60b39581960b01b3d8add10afc65461d42658723e2a6bb15568d6b2928ebf523508635b635df250a28b4d0b68e4f90b9d3650336878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"
RDEPENDS:${PN} += ""

inherit rpm
