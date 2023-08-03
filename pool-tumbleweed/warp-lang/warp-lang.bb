SUMMARY = "Translations for package warp"
DESCRIPTION = "Provides translations for the 'warp' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.4"

RPM_NAME = "warp-lang-0.5.4-1.1.noarch.rpm"
RPM_HASH = "b25f1f230bf74a93dd893d565da2b333f5fc6d8aeb8566ad4e1b89558da153674dc7dbf18310ee31d57d58670de80f16a878e9ab776322903288881cea99f96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-warp-ca \
locale-warp-da \
locale-warp-de \
locale-warp-es \
locale-warp-eu \
locale-warp-fa \
locale-warp-fi \
locale-warp-fr \
locale-warp-gl \
locale-warp-he \
locale-warp-hr \
locale-warp-hu \
locale-warp-id \
locale-warp-it \
locale-warp-ka \
locale-warp-ko \
locale-warp-nl \
locale-warp-oc \
locale-warp-pt \
locale-warp-pt-BR \
locale-warp-ru \
locale-warp-sl \
locale-warp-sr \
locale-warp-sv \
locale-warp-tr \
locale-warp-uk \
locale-warp-vi \
locale-warp-zh-CN \
warp-lang \
warp-lang-all"

RDEPENDS:${PN} += "warp"

inherit rpm
