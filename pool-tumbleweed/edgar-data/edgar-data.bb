SUMMARY = "Architecture independent data for edgar"
DESCRIPTION = "This package contains the game data for edgar. \
It is required to play the game."
LICENSE = "GPL-2.0-or-later"

PV = "1.36"

RPM_NAME = "edgar-data-1.36-1.3.noarch.rpm"
RPM_HASH = "d2ee354da85bbf5abf48ecae3ae6683804e0105be313274578034dcb9d05770580845cf3c6474a12e22f259538af8330cc4a8127643d38270187926804e3becf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edgar-data"

RDEPENDS:${PN} += "edgar"

inherit rpm
