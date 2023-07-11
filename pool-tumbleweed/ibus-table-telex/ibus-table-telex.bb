SUMMARY = "Telex table for ibus-table"
DESCRIPTION = "ibus-table-telex provides the Vietnamese telex table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-telex-1.3.16-1.1.noarch.rpm"
RPM_HASH = "3b53d18f9e53e60b7f1da5c74941386c106b21f011427b0ffa3b531f005f324d863b7e696b6efe44b0effe5e77e669b01e47e929ffde842a9d93be00b5b61406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-telex"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
