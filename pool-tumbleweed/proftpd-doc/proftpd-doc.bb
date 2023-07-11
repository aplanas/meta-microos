SUMMARY = "Documentation for ProFTPD"
DESCRIPTION = "Here are Documentation for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-doc-1.3.7f-1.4.aarch64.rpm"
RPM_HASH = "e4b3b5008663f98f5cba8bf8c7aaecccc318982712ff998bb40af0f232fa01e3fb6b222def17f1419c69f428c3d9a52842691a14892827574444a900c2462327"

RPROVIDES:${PN} += "proftpd-doc"

RDEPENDS:${PN} += "proftpd"

inherit rpm
