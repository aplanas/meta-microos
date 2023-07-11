SUMMARY = "Translations for package ciano"
DESCRIPTION = "Provides translations for the 'ciano' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-lang-0.2.4-1.23.noarch.rpm"
RPM_HASH = "ddc6abb084a3897eb0b1465649ffd0752a8c198a728553e6fd0c54b970d6b1307076063e7d35ba60d3a4a1ecedefdeed349b7af9628bbd53c326b979b8a1bac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ciano-lang \
ciano-lang-all \
locale-ciano-da \
locale-ciano-es \
locale-ciano-fr \
locale-ciano-lt \
locale-ciano-nl \
locale-ciano-pt \
locale-ciano-pt-BR \
locale-ciano-tr \
locale-ciano-zh-CN"

RDEPENDS:${PN} += "ciano"

inherit rpm
