SUMMARY = "Translations for package budgie-screenshot-applet"
DESCRIPTION = "Provides translations for the 'budgie-screenshot-applet' package."
LICENSE = "GPL-2.0-or-later"

PV = "20200503"

RPM_NAME = "budgie-screenshot-applet-lang-20200503-2.8.noarch.rpm"
RPM_HASH = "2c5b1297e72d2fd377905c6a2708e9a1bdc883fcb7e0cffc85696565ac22aa4cb1316e78f23d1571d124902e4e4ac4a1e44cf46edcf405b20f28c8e38f966a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-screenshot-applet-lang budgie-screenshot-applet-lang-all locale(budgie-screenshot-applet:ca) locale(budgie-screenshot-applet:da) locale(budgie-screenshot-applet:de) locale(budgie-screenshot-applet:es) locale(budgie-screenshot-applet:fi) locale(budgie-screenshot-applet:fr) locale(budgie-screenshot-applet:id) locale(budgie-screenshot-applet:lt) locale(budgie-screenshot-applet:nl_BE) locale(budgie-screenshot-applet:pl_PL) locale(budgie-screenshot-applet:sv)"
RDEPENDS:${PN} += "budgie-screenshot-applet"

inherit rpm
