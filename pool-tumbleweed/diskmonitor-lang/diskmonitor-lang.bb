SUMMARY = "Translations for package diskmonitor"
DESCRIPTION = "Provides translations for the 'diskmonitor' package."
LICENSE = "GPL-2.0-only"

PV = "0.3.4"

RPM_NAME = "diskmonitor-lang-0.3.4-3.8.noarch.rpm"
RPM_HASH = "61bd598b318a0391ebec851417cbf127b075ca1a0f576881f473c62ee01510a92c019a437a194eeeab6e851b4d4a742408013cf4f0590669b1d495f40515ce9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diskmonitor-lang \
diskmonitor-lang-all \
locale(diskmonitor:fr) \
locale(diskmonitor:sl)"

RDEPENDS:${PN} += "diskmonitor"

inherit rpm
