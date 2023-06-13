SUMMARY = "Telex table for ibus-table"
DESCRIPTION = "ibus-table-telex provides the Vietnamese telex table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-telex-1.3.13-2.3.noarch.rpm"
RPM_HASH = "85e1039a7c757141698c818b2949cd6a6a9e597de16dd1be30ba20b1b4de66a0dd484eacd88a176072afc2f1853a7ccb1a4ed312b7c795fad1e2ba1a9108ec9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-telex"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
