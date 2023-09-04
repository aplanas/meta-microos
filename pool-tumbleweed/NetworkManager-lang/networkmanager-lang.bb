SUMMARY = "Translations for package NetworkManager"
DESCRIPTION = "Provides translations for the 'NetworkManager' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.44.0"

RPM_NAME = "NetworkManager-lang-1.44.0-1.1.noarch.rpm"
RPM_HASH = "b8f2e16fd3c2b0177bc00d53ee7c0096d4baf7d66ccaa99428d4c80515edb8615cd9112ac3eed6b7ebf72ab83eb46fdceef47d784ac9f49ef8711e28992f57eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-lang \
NetworkManager-lang-all \
locale-NetworkManager-as \
locale-NetworkManager-be@latin \
locale-NetworkManager-bg \
locale-NetworkManager-bn-IN \
locale-NetworkManager-bs \
locale-NetworkManager-ca \
locale-NetworkManager-cs \
locale-NetworkManager-da \
locale-NetworkManager-de \
locale-NetworkManager-dz \
locale-NetworkManager-el \
locale-NetworkManager-en-CA \
locale-NetworkManager-en-GB \
locale-NetworkManager-eo \
locale-NetworkManager-es \
locale-NetworkManager-et \
locale-NetworkManager-eu \
locale-NetworkManager-fi \
locale-NetworkManager-fr \
locale-NetworkManager-gd \
locale-NetworkManager-gl \
locale-NetworkManager-gu \
locale-NetworkManager-he \
locale-NetworkManager-hi \
locale-NetworkManager-hr \
locale-NetworkManager-hu \
locale-NetworkManager-id \
locale-NetworkManager-it \
locale-NetworkManager-ja \
locale-NetworkManager-ka \
locale-NetworkManager-kn \
locale-NetworkManager-ko \
locale-NetworkManager-lt \
locale-NetworkManager-lv \
locale-NetworkManager-mk \
locale-NetworkManager-ml \
locale-NetworkManager-mr \
locale-NetworkManager-nb \
locale-NetworkManager-ne \
locale-NetworkManager-nl \
locale-NetworkManager-oc \
locale-NetworkManager-or \
locale-NetworkManager-pa \
locale-NetworkManager-pl \
locale-NetworkManager-pt \
locale-NetworkManager-pt-BR \
locale-NetworkManager-ro \
locale-NetworkManager-ru \
locale-NetworkManager-sk \
locale-NetworkManager-sl \
locale-NetworkManager-sq \
locale-NetworkManager-sr \
locale-NetworkManager-sr@latin \
locale-NetworkManager-sv \
locale-NetworkManager-ta \
locale-NetworkManager-te \
locale-NetworkManager-th \
locale-NetworkManager-tr \
locale-NetworkManager-uk \
locale-NetworkManager-vi \
locale-NetworkManager-wa \
locale-NetworkManager-zh-CN \
locale-NetworkManager-zh-HK \
locale-NetworkManager-zh-TW"

RDEPENDS:${PN} += "NetworkManager"

inherit rpm
