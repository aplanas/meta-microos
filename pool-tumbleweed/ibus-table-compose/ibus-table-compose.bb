SUMMARY = "The Compose table for ibus-table"
DESCRIPTION = "ibus-table-compose provides the Compose table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-compose-1.3.16-1.1.noarch.rpm"
RPM_HASH = "fda67fa119baa855d243124ebffbba56154fca4c5f5632c6d8faf1261d6ebcc1c7298c8fd4c58164ff9ff24f88e08a2097a62ec2dc8d463264263f00b10cdd60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-compose"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
