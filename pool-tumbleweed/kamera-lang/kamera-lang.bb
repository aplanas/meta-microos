SUMMARY = "Translations for package kamera"
DESCRIPTION = "Provides translations for the 'kamera' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kamera-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "6cfdc75e21faa35878671cc5564821e4aa0de0e9e1c6b2b99117b484288d6cba644b25bc90b780bb8c04f2256e5cabd6f4bad17ed8dc228e5ceb15fd55c7f413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kamera-lang \
kamera-lang-all \
locale-kamera-af \
locale-kamera-ar \
locale-kamera-az \
locale-kamera-be \
locale-kamera-bg \
locale-kamera-br \
locale-kamera-bs \
locale-kamera-ca \
locale-kamera-ca@valencia \
locale-kamera-cs \
locale-kamera-cy \
locale-kamera-da \
locale-kamera-de \
locale-kamera-el \
locale-kamera-en-GB \
locale-kamera-eo \
locale-kamera-es \
locale-kamera-et \
locale-kamera-eu \
locale-kamera-fa \
locale-kamera-fi \
locale-kamera-fr \
locale-kamera-ga \
locale-kamera-gl \
locale-kamera-he \
locale-kamera-hi \
locale-kamera-hr \
locale-kamera-hu \
locale-kamera-ia \
locale-kamera-id \
locale-kamera-is \
locale-kamera-it \
locale-kamera-ja \
locale-kamera-ka \
locale-kamera-kk \
locale-kamera-km \
locale-kamera-ko \
locale-kamera-lt \
locale-kamera-lv \
locale-kamera-mk \
locale-kamera-ml \
locale-kamera-mr \
locale-kamera-ms \
locale-kamera-nb \
locale-kamera-nds \
locale-kamera-ne \
locale-kamera-nl \
locale-kamera-nn \
locale-kamera-oc \
locale-kamera-pa \
locale-kamera-pl \
locale-kamera-pt \
locale-kamera-pt-BR \
locale-kamera-ro \
locale-kamera-ru \
locale-kamera-si \
locale-kamera-sk \
locale-kamera-sl \
locale-kamera-sq \
locale-kamera-sv \
locale-kamera-ta \
locale-kamera-th \
locale-kamera-tr \
locale-kamera-ug \
locale-kamera-uk \
locale-kamera-vi \
locale-kamera-zh-CN \
locale-kamera-zh-HK \
locale-kamera-zh-TW"

RDEPENDS:${PN} += "kamera"

inherit rpm
