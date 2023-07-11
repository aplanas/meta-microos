SUMMARY = "Translations for package mate-applet-dock"
DESCRIPTION = "Provides translations for the 'mate-applet-dock' package."
LICENSE = "GPL-2.0-or-later"

PV = "21.10.0"

RPM_NAME = "mate-applet-dock-lang-21.10.0-1.7.noarch.rpm"
RPM_HASH = "af5184fde18f476da11916737a3d74b126a96f3cff1de8d6741c8d1af5429c7cd4171031876cc9d452090398ddbabf60c59301da682b9862db884c2fda1216df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-applet-dock-es \
locale-mate-applet-dock-fr \
mate-applet-dock-lang \
mate-applet-dock-lang-all"

RDEPENDS:${PN} += "mate-applet-dock"

inherit rpm
