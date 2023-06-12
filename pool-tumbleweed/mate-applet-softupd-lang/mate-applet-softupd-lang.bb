SUMMARY = "Translations for package mate-applet-softupd"
DESCRIPTION = "Provides translations for the 'mate-applet-softupd' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.8"

RPM_NAME = "mate-applet-softupd-lang-0.4.8-1.9.noarch.rpm"
RPM_HASH = "b7fadf49a3bade8da001690f4ad61c8c1b8cdab566cd76a8fe20dc7206afa5f7cf100b935c98b353feaff0d2a929352b8e24a9f8fbaf2b9acaa21125417ce590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mate-applet-softupd:en_GB) \
locale(mate-applet-softupd:en_US) \
locale(mate-applet-softupd:fr_FR) \
locale(mate-applet-softupd:pt_BR) \
locale(mate-applet-softupd:pt_PT) \
locale(mate-applet-softupd:ru_RU) \
locale(mate-applet-softupd:zh_CN) \
mate-applet-softupd-lang \
mate-applet-softupd-lang-all"
RDEPENDS:${PN} += "mate-applet-softupd"

inherit rpm
