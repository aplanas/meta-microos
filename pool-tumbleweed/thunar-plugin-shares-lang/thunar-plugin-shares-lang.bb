SUMMARY = "Translations for package thunar-plugin-shares"
DESCRIPTION = "Provides translations for the 'thunar-plugin-shares' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2"

RPM_NAME = "thunar-plugin-shares-lang-0.3.2-1.4.noarch.rpm"
RPM_HASH = "cc20a30065aa0cfc81dcd6bf6942827fe9dad80c9c0ee1030676dbbb81c16f5b850512cd4580e5f5de2087e22e4eb90249554ba0ef17117219465db0658d1b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thunar-plugin-shares-ar \
locale-thunar-plugin-shares-be \
locale-thunar-plugin-shares-bg \
locale-thunar-plugin-shares-ca \
locale-thunar-plugin-shares-cs \
locale-thunar-plugin-shares-da \
locale-thunar-plugin-shares-de \
locale-thunar-plugin-shares-el \
locale-thunar-plugin-shares-en-AU \
locale-thunar-plugin-shares-en-GB \
locale-thunar-plugin-shares-es \
locale-thunar-plugin-shares-et \
locale-thunar-plugin-shares-eu \
locale-thunar-plugin-shares-fi \
locale-thunar-plugin-shares-fr \
locale-thunar-plugin-shares-gl \
locale-thunar-plugin-shares-he \
locale-thunar-plugin-shares-hr \
locale-thunar-plugin-shares-hu \
locale-thunar-plugin-shares-id \
locale-thunar-plugin-shares-is \
locale-thunar-plugin-shares-it \
locale-thunar-plugin-shares-ja \
locale-thunar-plugin-shares-ko \
locale-thunar-plugin-shares-lt \
locale-thunar-plugin-shares-lv \
locale-thunar-plugin-shares-ms \
locale-thunar-plugin-shares-nb \
locale-thunar-plugin-shares-nl \
locale-thunar-plugin-shares-oc \
locale-thunar-plugin-shares-pl \
locale-thunar-plugin-shares-pt \
locale-thunar-plugin-shares-pt-BR \
locale-thunar-plugin-shares-ro \
locale-thunar-plugin-shares-ru \
locale-thunar-plugin-shares-sk \
locale-thunar-plugin-shares-sl \
locale-thunar-plugin-shares-sq \
locale-thunar-plugin-shares-sr \
locale-thunar-plugin-shares-sv \
locale-thunar-plugin-shares-tr \
locale-thunar-plugin-shares-ug \
locale-thunar-plugin-shares-uk \
locale-thunar-plugin-shares-vi \
locale-thunar-plugin-shares-zh-CN \
locale-thunar-plugin-shares-zh-TW \
thunar-plugin-shares-lang \
thunar-plugin-shares-lang-all"

RDEPENDS:${PN} += "thunar-plugin-shares"

inherit rpm
