SUMMARY = "Translations for package cantor"
DESCRIPTION = "Provides translations for the 'cantor' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "cantor-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "f786897b542dd8291e3b623f7016512b6d116781cbeb438a890d6e59900fa7338ba6f6d0c50eb4d69431a2d8644a640a7ee033f591e641fb979deec7eab074b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantor-lang \
cantor-lang-all \
locale-cantor-ar \
locale-cantor-bg \
locale-cantor-bs \
locale-cantor-ca \
locale-cantor-ca@valencia \
locale-cantor-cs \
locale-cantor-da \
locale-cantor-de \
locale-cantor-el \
locale-cantor-en-GB \
locale-cantor-eo \
locale-cantor-es \
locale-cantor-et \
locale-cantor-eu \
locale-cantor-fi \
locale-cantor-fr \
locale-cantor-ga \
locale-cantor-gl \
locale-cantor-hr \
locale-cantor-hu \
locale-cantor-ia \
locale-cantor-it \
locale-cantor-ja \
locale-cantor-ka \
locale-cantor-kk \
locale-cantor-ko \
locale-cantor-lt \
locale-cantor-lv \
locale-cantor-ml \
locale-cantor-mr \
locale-cantor-nb \
locale-cantor-nds \
locale-cantor-nl \
locale-cantor-nn \
locale-cantor-pa \
locale-cantor-pl \
locale-cantor-pt \
locale-cantor-pt-BR \
locale-cantor-ro \
locale-cantor-ru \
locale-cantor-sk \
locale-cantor-sl \
locale-cantor-sv \
locale-cantor-ta \
locale-cantor-th \
locale-cantor-tr \
locale-cantor-ug \
locale-cantor-uk \
locale-cantor-zh-CN \
locale-cantor-zh-TW"

RDEPENDS:${PN} += "cantor"

inherit rpm
