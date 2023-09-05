SUMMARY = "mail client icon"
DESCRIPTION = "The KMail application icon that is shared with a number of applications"
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kmail-application-icons-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c6689875f455318cd39b58e20b4cebe85b4776fc810a7785b1a4095ab64a38c41b712be2d077a08082181f881732a35cceb17f13877d9a837776ecebf580901e"

RPROVIDES:${PN} += "kmail-application-icons"

RDEPENDS:${PN} += ""

inherit rpm
