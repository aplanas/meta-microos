SUMMARY = "Translations for package deepin-terminal"
DESCRIPTION = "Provides translations for the 'deepin-terminal' package."
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "deepin-terminal-lang-5.4.33-1.8.noarch.rpm"
RPM_HASH = "45ae6691790e9b1a1fcb7a005302acc26352cfb6e2292da3b5483962e3b42182937e4c8f58d5787c5b6464201c348e13dcdfd6e8af600b02a06e63988a1cc0bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-terminal-lang \
deepin-terminal-lang-all"

RDEPENDS:${PN} += "deepin-terminal"

inherit rpm
