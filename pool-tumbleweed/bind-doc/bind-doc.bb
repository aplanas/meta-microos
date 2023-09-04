SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-doc-9.18.18-1.1.noarch.rpm"
RPM_HASH = "32f62839c445741917c011d8b5bc8f837e1602bc9445b08c32c56837eb7ac93485228cd464f08a203652c0cdf9af90bff0ca9cc4ee16c060a049ab02f61e3e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"

RDEPENDS:${PN} += ""

inherit rpm
