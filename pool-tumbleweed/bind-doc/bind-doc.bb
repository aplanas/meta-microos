SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-doc-9.18.16-2.1.noarch.rpm"
RPM_HASH = "d0da1e09449c2aee4714ab5406986f0902c92b21a7be05a08fe851bf727eb19777aeb10762eebb4932c17e615c6cc77890e70c450328c628b3586ba190a4dea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"

RDEPENDS:${PN} += ""

inherit rpm
