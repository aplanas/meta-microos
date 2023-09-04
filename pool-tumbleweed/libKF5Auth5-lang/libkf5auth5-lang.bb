SUMMARY = "Translations for package libKF5Auth5"
DESCRIPTION = "Provides translations for the 'libKF5Auth5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Auth5-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "433e87ddb4bb6bdd896030852311ac1ab1e018ce0cdced9700cfbf0618024a210b03b8d9aaf41009a3e40cd96fe82e14ce95a0a13950703747a45546f0ef0d46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Auth5-lang \
libKF5Auth5-lang-all \
locale-libKF5Auth5-af \
locale-libKF5Auth5-ar \
locale-libKF5Auth5-as \
locale-libKF5Auth5-az \
locale-libKF5Auth5-be \
locale-libKF5Auth5-be@latin \
locale-libKF5Auth5-bg \
locale-libKF5Auth5-bn \
locale-libKF5Auth5-bn-IN \
locale-libKF5Auth5-br \
locale-libKF5Auth5-bs \
locale-libKF5Auth5-ca \
locale-libKF5Auth5-ca@valencia \
locale-libKF5Auth5-cs \
locale-libKF5Auth5-cy \
locale-libKF5Auth5-da \
locale-libKF5Auth5-de \
locale-libKF5Auth5-el \
locale-libKF5Auth5-en-GB \
locale-libKF5Auth5-eo \
locale-libKF5Auth5-es \
locale-libKF5Auth5-et \
locale-libKF5Auth5-eu \
locale-libKF5Auth5-fa \
locale-libKF5Auth5-fi \
locale-libKF5Auth5-fr \
locale-libKF5Auth5-ga \
locale-libKF5Auth5-gd \
locale-libKF5Auth5-gl \
locale-libKF5Auth5-gu \
locale-libKF5Auth5-he \
locale-libKF5Auth5-hi \
locale-libKF5Auth5-hr \
locale-libKF5Auth5-hu \
locale-libKF5Auth5-ia \
locale-libKF5Auth5-id \
locale-libKF5Auth5-is \
locale-libKF5Auth5-it \
locale-libKF5Auth5-ja \
locale-libKF5Auth5-ka \
locale-libKF5Auth5-kk \
locale-libKF5Auth5-km \
locale-libKF5Auth5-kn \
locale-libKF5Auth5-ko \
locale-libKF5Auth5-lt \
locale-libKF5Auth5-lv \
locale-libKF5Auth5-mai \
locale-libKF5Auth5-mk \
locale-libKF5Auth5-ml \
locale-libKF5Auth5-mr \
locale-libKF5Auth5-ms \
locale-libKF5Auth5-nb \
locale-libKF5Auth5-nds \
locale-libKF5Auth5-ne \
locale-libKF5Auth5-nl \
locale-libKF5Auth5-nn \
locale-libKF5Auth5-oc \
locale-libKF5Auth5-or \
locale-libKF5Auth5-pa \
locale-libKF5Auth5-pl \
locale-libKF5Auth5-pt \
locale-libKF5Auth5-pt-BR \
locale-libKF5Auth5-ro \
locale-libKF5Auth5-ru \
locale-libKF5Auth5-si \
locale-libKF5Auth5-sk \
locale-libKF5Auth5-sl \
locale-libKF5Auth5-sq \
locale-libKF5Auth5-sr \
locale-libKF5Auth5-sr@ijekavian \
locale-libKF5Auth5-sr@ijekavianlatin \
locale-libKF5Auth5-sr@latin \
locale-libKF5Auth5-sv \
locale-libKF5Auth5-ta \
locale-libKF5Auth5-te \
locale-libKF5Auth5-th \
locale-libKF5Auth5-tr \
locale-libKF5Auth5-ug \
locale-libKF5Auth5-uk \
locale-libKF5Auth5-vi \
locale-libKF5Auth5-wa \
locale-libKF5Auth5-zh-CN \
locale-libKF5Auth5-zh-HK \
locale-libKF5Auth5-zh-TW"

RDEPENDS:${PN} += "libKF5Auth5"

inherit rpm
