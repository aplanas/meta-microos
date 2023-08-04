SUMMARY = "BIND documentation"
DESCRIPTION = "Documentation of the Berkeley Internet Name Domain (BIND) Domain Name \
System implementation of the Domain Name System (DNS) protocols.  This \
includes also the BIND Administrator Reference Manual (ARM)."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-doc-9.18.17-1.2.noarch.rpm"
RPM_HASH = "b0bc6b898e93bcc00332614f187cd9d0965cfb7a05edb6a7bf13cc0e6033031ab60ec93c51516ceb0b6b21cb862a90d4bd93862b1def24b272b13b804d567c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bind-doc"

RDEPENDS:${PN} += ""

inherit rpm
