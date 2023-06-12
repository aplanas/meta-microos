SUMMARY = "Translations for package desktopfolder"
DESCRIPTION = "Provides translations for the 'desktopfolder' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "desktopfolder-lang-1.1.3-3.7.noarch.rpm"
RPM_HASH = "fe2ae1ccc142011f62727b1c830bc50403edc993c1e3a57759442178832b27f7380e993ca1389c5f943aea2ecb98113c4caf9abc9a7dc7f3ad2d27bb9251f784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "desktopfolder-lang \
desktopfolder-lang-all \
locale(desktopfolder:bg) \
locale(desktopfolder:ca) \
locale(desktopfolder:cs) \
locale(desktopfolder:da) \
locale(desktopfolder:de_DE) \
locale(desktopfolder:en_GB) \
locale(desktopfolder:eo) \
locale(desktopfolder:es) \
locale(desktopfolder:fi) \
locale(desktopfolder:fr) \
locale(desktopfolder:fr_FR) \
locale(desktopfolder:hu) \
locale(desktopfolder:it) \
locale(desktopfolder:ja) \
locale(desktopfolder:lt) \
locale(desktopfolder:oc) \
locale(desktopfolder:pl) \
locale(desktopfolder:pt_BR) \
locale(desktopfolder:pt_PT) \
locale(desktopfolder:ru) \
locale(desktopfolder:tr) \
locale(desktopfolder:uk) \
locale(desktopfolder:zh_CN)"
RDEPENDS:${PN} += "desktopfolder"

inherit rpm
