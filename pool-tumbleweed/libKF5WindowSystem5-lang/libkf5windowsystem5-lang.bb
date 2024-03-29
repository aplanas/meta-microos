SUMMARY = "Translations for package libKF5WindowSystem5"
DESCRIPTION = "Provides translations for the 'libKF5WindowSystem5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5WindowSystem5-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "3fb8358c28454aab0eea040b8dd3011ddd6077e5af3b6da2738d187c7069a3f5e9e9b94b92f97675269f21c4a23eceac5bc63d28ca688f2bbbee4eae17eaf964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5WindowSystem5-lang \
libKF5WindowSystem5-lang-all \
locale-libKF5WindowSystem5-af \
locale-libKF5WindowSystem5-ar \
locale-libKF5WindowSystem5-as \
locale-libKF5WindowSystem5-az \
locale-libKF5WindowSystem5-be \
locale-libKF5WindowSystem5-be@latin \
locale-libKF5WindowSystem5-bg \
locale-libKF5WindowSystem5-bn \
locale-libKF5WindowSystem5-bn-IN \
locale-libKF5WindowSystem5-br \
locale-libKF5WindowSystem5-bs \
locale-libKF5WindowSystem5-ca \
locale-libKF5WindowSystem5-ca@valencia \
locale-libKF5WindowSystem5-cs \
locale-libKF5WindowSystem5-cy \
locale-libKF5WindowSystem5-da \
locale-libKF5WindowSystem5-de \
locale-libKF5WindowSystem5-el \
locale-libKF5WindowSystem5-en-GB \
locale-libKF5WindowSystem5-eo \
locale-libKF5WindowSystem5-es \
locale-libKF5WindowSystem5-et \
locale-libKF5WindowSystem5-eu \
locale-libKF5WindowSystem5-fa \
locale-libKF5WindowSystem5-fi \
locale-libKF5WindowSystem5-fr \
locale-libKF5WindowSystem5-ga \
locale-libKF5WindowSystem5-gd \
locale-libKF5WindowSystem5-gl \
locale-libKF5WindowSystem5-gu \
locale-libKF5WindowSystem5-he \
locale-libKF5WindowSystem5-hi \
locale-libKF5WindowSystem5-hr \
locale-libKF5WindowSystem5-hu \
locale-libKF5WindowSystem5-ia \
locale-libKF5WindowSystem5-id \
locale-libKF5WindowSystem5-is \
locale-libKF5WindowSystem5-it \
locale-libKF5WindowSystem5-ja \
locale-libKF5WindowSystem5-ka \
locale-libKF5WindowSystem5-kk \
locale-libKF5WindowSystem5-km \
locale-libKF5WindowSystem5-kn \
locale-libKF5WindowSystem5-ko \
locale-libKF5WindowSystem5-lt \
locale-libKF5WindowSystem5-lv \
locale-libKF5WindowSystem5-mai \
locale-libKF5WindowSystem5-mk \
locale-libKF5WindowSystem5-ml \
locale-libKF5WindowSystem5-mr \
locale-libKF5WindowSystem5-ms \
locale-libKF5WindowSystem5-nb \
locale-libKF5WindowSystem5-nds \
locale-libKF5WindowSystem5-ne \
locale-libKF5WindowSystem5-nl \
locale-libKF5WindowSystem5-nn \
locale-libKF5WindowSystem5-oc \
locale-libKF5WindowSystem5-or \
locale-libKF5WindowSystem5-pa \
locale-libKF5WindowSystem5-pl \
locale-libKF5WindowSystem5-pt \
locale-libKF5WindowSystem5-pt-BR \
locale-libKF5WindowSystem5-ro \
locale-libKF5WindowSystem5-ru \
locale-libKF5WindowSystem5-si \
locale-libKF5WindowSystem5-sk \
locale-libKF5WindowSystem5-sl \
locale-libKF5WindowSystem5-sq \
locale-libKF5WindowSystem5-sr \
locale-libKF5WindowSystem5-sr@ijekavian \
locale-libKF5WindowSystem5-sr@ijekavianlatin \
locale-libKF5WindowSystem5-sr@latin \
locale-libKF5WindowSystem5-sv \
locale-libKF5WindowSystem5-ta \
locale-libKF5WindowSystem5-te \
locale-libKF5WindowSystem5-th \
locale-libKF5WindowSystem5-tr \
locale-libKF5WindowSystem5-ug \
locale-libKF5WindowSystem5-uk \
locale-libKF5WindowSystem5-vi \
locale-libKF5WindowSystem5-wa \
locale-libKF5WindowSystem5-zh-CN \
locale-libKF5WindowSystem5-zh-HK \
locale-libKF5WindowSystem5-zh-TW"

RDEPENDS:${PN} += "libKF5WindowSystem5"

inherit rpm
