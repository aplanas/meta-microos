SUMMARY = "Translations for package deepin-dock"
DESCRIPTION = "Provides translations for the 'deepin-dock' package."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.65"

RPM_NAME = "deepin-dock-lang-5.5.65-1.3.noarch.rpm"
RPM_HASH = "454df672435b1dd8cf8851e1670bbe6f6ff917106a9a0ddc32d4a9c6b679a24037c749dff0e7b4325ed9fd7693fd13dc24a1c6b2ebc9a69cc04f4ed5befce895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-dock-lang \
deepin-dock-lang-all"
RDEPENDS:${PN} += "deepin-dock"

inherit rpm
