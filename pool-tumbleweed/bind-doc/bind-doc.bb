SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-doc-9.18.17-1.1.noarch.rpm"
RPM_HASH = "4c73cb5e9c43a3a4759cab29a1a9669101ccabc03c5c0d2575fce53ae6f0cac2313b6a4fb1a649606850f02d3acba764de87194a6bc2b0c4cd88631816ce0005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"

RDEPENDS:${PN} += ""

inherit rpm
