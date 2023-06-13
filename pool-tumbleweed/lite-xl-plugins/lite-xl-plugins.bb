SUMMARY = "Additional plugins for lite-xl"
DESCRIPTION = "Plugins for the Lite XL text editor, originally forked from the lite plugins repository."
LICENSE = "MIT"

PV = "git20221231.bf3a3b7"

RPM_NAME = "lite-xl-plugins-git20221231.bf3a3b7-1.2.noarch.rpm"
RPM_HASH = "eb47b21d69b4c71b1c8451cbe8e007caa2d89cf48e170107cb315e057dc37a428fec81b35951819ae2657b067bd907a7202bdd2cd250f2e097c3159b18145690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lite-xl-plugins"

RDEPENDS:${PN} += "lite-xl \
lite-xl-widgets"

inherit rpm
