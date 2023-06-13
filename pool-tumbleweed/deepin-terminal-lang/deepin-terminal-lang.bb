SUMMARY = "Translations for package deepin-terminal"
DESCRIPTION = "Provides translations for the 'deepin-terminal' package."
LICENSE = "GPL-3.0-only"

PV = "5.4.33"

RPM_NAME = "deepin-terminal-lang-5.4.33-1.7.noarch.rpm"
RPM_HASH = "970172034b7b660a16c1ff92a805da800a1fa2945ce473e357e2c83a2776c29ba1f37ee73b34dc33d1bec9426b2e8cca730ed0209771f56fd44af797849edc7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-terminal-lang \
deepin-terminal-lang-all"

RDEPENDS:${PN} += "deepin-terminal"

inherit rpm
