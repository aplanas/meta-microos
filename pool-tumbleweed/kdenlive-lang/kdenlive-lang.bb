SUMMARY = "Translations for package kdenlive"
DESCRIPTION = "Provides translations for the 'kdenlive' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdenlive-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "01e744fdd8790b8451c6126d69f7de5fc9adfa1a978f9e8484ea852a62bac4994f1fc82bb4c0c2a123a3663bc84a9789fcff5d4331b9ddd478dd699c84c72b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenlive-lang \
kdenlive-lang-all \
locale-kdenlive-ar \
locale-kdenlive-az \
locale-kdenlive-bs \
locale-kdenlive-ca \
locale-kdenlive-ca@valencia \
locale-kdenlive-cs \
locale-kdenlive-da \
locale-kdenlive-de \
locale-kdenlive-el \
locale-kdenlive-en-GB \
locale-kdenlive-eo \
locale-kdenlive-es \
locale-kdenlive-et \
locale-kdenlive-eu \
locale-kdenlive-fi \
locale-kdenlive-fr \
locale-kdenlive-ga \
locale-kdenlive-gl \
locale-kdenlive-he \
locale-kdenlive-hr \
locale-kdenlive-hu \
locale-kdenlive-id \
locale-kdenlive-it \
locale-kdenlive-ja \
locale-kdenlive-ka \
locale-kdenlive-ko \
locale-kdenlive-lt \
locale-kdenlive-mr \
locale-kdenlive-nb \
locale-kdenlive-nds \
locale-kdenlive-nl \
locale-kdenlive-pl \
locale-kdenlive-pt \
locale-kdenlive-pt-BR \
locale-kdenlive-ro \
locale-kdenlive-ru \
locale-kdenlive-sk \
locale-kdenlive-sl \
locale-kdenlive-sv \
locale-kdenlive-tr \
locale-kdenlive-ug \
locale-kdenlive-uk \
locale-kdenlive-zh-CN \
locale-kdenlive-zh-TW"

RDEPENDS:${PN} += "kdenlive"

inherit rpm
