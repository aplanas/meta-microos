SUMMARY = "Cockpit user interface for Wicked"
DESCRIPTION = "Cockpit component for managing network configuration through Wicked"
LICENSE = "GPL-2.0-only"

PV = "5~git0.82629da"

RPM_NAME = "cockpit-wicked-5~git0.82629da-1.1.noarch.rpm"
RPM_HASH = "df2399e5da2abc0e325584afac42af6a32f779397bda9cc7f2341b3b8e58100c136b047c203528b0dc3905cdbfb8bb09e27cf8103290b97e1c77e2201683eba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-wicked"

RDEPENDS:${PN} += "cockpit-bridge \
wicked"

inherit rpm
