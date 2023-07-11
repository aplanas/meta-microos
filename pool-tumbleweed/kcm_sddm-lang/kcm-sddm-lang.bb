SUMMARY = "Translations for package kcm_sddm"
DESCRIPTION = "Provides translations for the 'kcm_sddm' package."
LICENSE = "GPL-2.0-only"

PV = "5.27.6"

RPM_NAME = "kcm_sddm-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "3701f104f418eee344b9946ca4303f573b41c24ba150ca2f6307a357fd38a3268ad13c760f49dfc532223cd2480cc4dfe63b1df24c7775be1f2c45159c306681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm-sddm-lang \
kcm-sddm-lang-all \
locale-kcm-sddm-ar \
locale-kcm-sddm-az \
locale-kcm-sddm-bg \
locale-kcm-sddm-bs \
locale-kcm-sddm-ca \
locale-kcm-sddm-ca@valencia \
locale-kcm-sddm-cs \
locale-kcm-sddm-da \
locale-kcm-sddm-de \
locale-kcm-sddm-el \
locale-kcm-sddm-en-GB \
locale-kcm-sddm-es \
locale-kcm-sddm-et \
locale-kcm-sddm-eu \
locale-kcm-sddm-fi \
locale-kcm-sddm-fr \
locale-kcm-sddm-gl \
locale-kcm-sddm-he \
locale-kcm-sddm-hi \
locale-kcm-sddm-hu \
locale-kcm-sddm-ia \
locale-kcm-sddm-id \
locale-kcm-sddm-it \
locale-kcm-sddm-ja \
locale-kcm-sddm-ka \
locale-kcm-sddm-ko \
locale-kcm-sddm-lt \
locale-kcm-sddm-ml \
locale-kcm-sddm-nb \
locale-kcm-sddm-nl \
locale-kcm-sddm-nn \
locale-kcm-sddm-pa \
locale-kcm-sddm-pl \
locale-kcm-sddm-pt \
locale-kcm-sddm-pt-BR \
locale-kcm-sddm-ro \
locale-kcm-sddm-ru \
locale-kcm-sddm-sk \
locale-kcm-sddm-sl \
locale-kcm-sddm-sr \
locale-kcm-sddm-sr@ijekavian \
locale-kcm-sddm-sr@ijekavianlatin \
locale-kcm-sddm-sr@latin \
locale-kcm-sddm-sv \
locale-kcm-sddm-tr \
locale-kcm-sddm-uk \
locale-kcm-sddm-zh-CN \
locale-kcm-sddm-zh-TW"

RDEPENDS:${PN} += "kcm-sddm"

inherit rpm
