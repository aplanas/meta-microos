SUMMARY = "Translations for package partclone"
DESCRIPTION = "Provides translations for the 'partclone' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.23"

RPM_NAME = "partclone-lang-0.3.23-1.4.noarch.rpm"
RPM_HASH = "05619cd38c9775aa1e2615b39dda9c5a35fd9b80bcbb3525aee67d3c3ec52b7f979f07bc1dcbc493e8390340419d95b7e12d1ace1dec101dc357030e25e3fe75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(partclone:fr_FR) \
locale(partclone:pt_BR) \
locale(partclone:vi) \
locale(partclone:zh_CN) \
locale(partclone:zh_TW) \
partclone-lang \
partclone-lang-all"

RDEPENDS:${PN} += "partclone"

inherit rpm
