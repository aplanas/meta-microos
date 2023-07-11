SUMMARY = "Translations for package krdc"
DESCRIPTION = "Provides translations for the 'krdc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "krdc-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "5ccfec17c590991455e56eca6d9d6d6c8247bbfde0320637b1326c7cc4b62850951a8fc00af8914234a9002eb1ea49f72fab4913aaa521630eba3b390a368574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krdc-lang \
krdc-lang-all \
locale-krdc-af \
locale-krdc-ar \
locale-krdc-be \
locale-krdc-bg \
locale-krdc-br \
locale-krdc-bs \
locale-krdc-ca \
locale-krdc-ca@valencia \
locale-krdc-cs \
locale-krdc-cy \
locale-krdc-da \
locale-krdc-de \
locale-krdc-el \
locale-krdc-en-GB \
locale-krdc-eo \
locale-krdc-es \
locale-krdc-et \
locale-krdc-eu \
locale-krdc-fa \
locale-krdc-fi \
locale-krdc-fr \
locale-krdc-ga \
locale-krdc-gl \
locale-krdc-he \
locale-krdc-hi \
locale-krdc-hr \
locale-krdc-hu \
locale-krdc-ia \
locale-krdc-is \
locale-krdc-it \
locale-krdc-ja \
locale-krdc-ka \
locale-krdc-kk \
locale-krdc-km \
locale-krdc-ko \
locale-krdc-lt \
locale-krdc-lv \
locale-krdc-mai \
locale-krdc-mk \
locale-krdc-mr \
locale-krdc-ms \
locale-krdc-nb \
locale-krdc-nds \
locale-krdc-ne \
locale-krdc-nl \
locale-krdc-nn \
locale-krdc-oc \
locale-krdc-pa \
locale-krdc-pl \
locale-krdc-pt \
locale-krdc-pt-BR \
locale-krdc-ro \
locale-krdc-ru \
locale-krdc-sk \
locale-krdc-sl \
locale-krdc-sq \
locale-krdc-sr \
locale-krdc-sr@ijekavian \
locale-krdc-sr@ijekavianlatin \
locale-krdc-sr@latin \
locale-krdc-sv \
locale-krdc-ta \
locale-krdc-th \
locale-krdc-tr \
locale-krdc-ug \
locale-krdc-uk \
locale-krdc-vi \
locale-krdc-zh-CN \
locale-krdc-zh-HK \
locale-krdc-zh-TW"

RDEPENDS:${PN} += "krdc"

inherit rpm
