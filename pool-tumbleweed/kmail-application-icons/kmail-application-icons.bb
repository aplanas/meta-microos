SUMMARY = "mail client icon"
DESCRIPTION = "The KMail application icon that is shared with a number of applications"
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kmail-application-icons-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "32c4d560a4ce294d17475de56ca0f2c4106132a17a40faa083ae603476dce6b3647e05d2b948a822c7995930e666db35e6265f2540ceaa66e678cdb378f0d360"

RPROVIDES:${PN} += "kmail-application-icons"

RDEPENDS:${PN} += ""

inherit rpm
