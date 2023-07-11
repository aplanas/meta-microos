SUMMARY = "Translations for package libadwaita"
DESCRIPTION = "Provides translations for the 'libadwaita' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "libadwaita-lang-1.3.3-1.1.noarch.rpm"
RPM_HASH = "b24b9373a58aad54552c77501869ac475e214fb64790cbcaf32f2bdfc8c6c1143412c3791f0302fe4ec4e3c7aa52dc59d90d5055b8a36ad76c0f581331e7dcbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-lang \
libadwaita-lang-all \
locale-libadwaita-be \
locale-libadwaita-bg \
locale-libadwaita-ca \
locale-libadwaita-cs \
locale-libadwaita-da \
locale-libadwaita-de \
locale-libadwaita-el \
locale-libadwaita-en-GB \
locale-libadwaita-es \
locale-libadwaita-eu \
locale-libadwaita-fa \
locale-libadwaita-fi \
locale-libadwaita-fr \
locale-libadwaita-fur \
locale-libadwaita-gl \
locale-libadwaita-he \
locale-libadwaita-hi \
locale-libadwaita-hr \
locale-libadwaita-hu \
locale-libadwaita-id \
locale-libadwaita-it \
locale-libadwaita-ja \
locale-libadwaita-ka \
locale-libadwaita-kk \
locale-libadwaita-ko \
locale-libadwaita-lt \
locale-libadwaita-ne \
locale-libadwaita-nl \
locale-libadwaita-oc \
locale-libadwaita-pl \
locale-libadwaita-pt \
locale-libadwaita-pt-BR \
locale-libadwaita-ro \
locale-libadwaita-ru \
locale-libadwaita-sk \
locale-libadwaita-sl \
locale-libadwaita-sr \
locale-libadwaita-sv \
locale-libadwaita-tr \
locale-libadwaita-uk \
locale-libadwaita-vi \
locale-libadwaita-zh-CN \
locale-libadwaita-zh-TW"

RDEPENDS:${PN} += "libadwaita"

inherit rpm
