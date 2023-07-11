SUMMARY = "Prewikka lang files"
DESCRIPTION = "Lang files for prewikka."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prewikka-lang-5.2.0-2.8.noarch.rpm"
RPM_HASH = "37460e1fda917331bb9fdcad4a2f3d598229782a379312bf6c6a99c9520f779292da6368af196fe1ec218ab4c5c541f1c0b1f39d5c7cd9ea0a08b6bbcf68a4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-prewikka-de \
locale-prewikka-en \
locale-prewikka-es \
locale-prewikka-fr \
locale-prewikka-it \
locale-prewikka-pl \
locale-prewikka-pt-BR \
locale-prewikka-ru \
prewikka-lang"

RDEPENDS:${PN} += ""

inherit rpm
