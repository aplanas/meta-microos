SUMMARY = "Translations for package mpDris2"
DESCRIPTION = "Provides translations for the 'mpDris2' package."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-lang-0.9.1-1.3.noarch.rpm"
RPM_HASH = "5c2a9818f1a9996b3da4ad279902efac755fefd9ce0b4044336dcb8a2761aff2acd3bb32ad3aa4190247f51adf4afd2adfc76ec7ed8df1a7be8f1d5fa72b6c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mpDris2-fr \
locale-mpDris2-nl \
mpDris2-lang \
mpDris2-lang-all"

RDEPENDS:${PN} += "mpDris2"

inherit rpm
