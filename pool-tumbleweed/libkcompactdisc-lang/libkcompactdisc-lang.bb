SUMMARY = "Translations for package libkcompactdisc"
DESCRIPTION = "Provides translations for the 'libkcompactdisc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkcompactdisc-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0f79b0652098ad65ae3fa9a0c5b6a1f5f49189aa92e406b1fdc7fb5201a1cbfaae629faf8f2d84b96062cea0bc0f8ad91d0ae1c338da1ec42eef70d951ba7242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkcompactdisc-lang \
libkcompactdisc-lang-all \
locale-libkcompactdisc-ar \
locale-libkcompactdisc-be \
locale-libkcompactdisc-bg \
locale-libkcompactdisc-bs \
locale-libkcompactdisc-ca \
locale-libkcompactdisc-ca@valencia \
locale-libkcompactdisc-cs \
locale-libkcompactdisc-da \
locale-libkcompactdisc-de \
locale-libkcompactdisc-el \
locale-libkcompactdisc-en-GB \
locale-libkcompactdisc-eo \
locale-libkcompactdisc-es \
locale-libkcompactdisc-et \
locale-libkcompactdisc-eu \
locale-libkcompactdisc-fi \
locale-libkcompactdisc-fr \
locale-libkcompactdisc-ga \
locale-libkcompactdisc-gl \
locale-libkcompactdisc-he \
locale-libkcompactdisc-hi \
locale-libkcompactdisc-hr \
locale-libkcompactdisc-hu \
locale-libkcompactdisc-ia \
locale-libkcompactdisc-is \
locale-libkcompactdisc-it \
locale-libkcompactdisc-ja \
locale-libkcompactdisc-ka \
locale-libkcompactdisc-kk \
locale-libkcompactdisc-km \
locale-libkcompactdisc-ko \
locale-libkcompactdisc-lt \
locale-libkcompactdisc-lv \
locale-libkcompactdisc-mk \
locale-libkcompactdisc-mr \
locale-libkcompactdisc-nb \
locale-libkcompactdisc-nds \
locale-libkcompactdisc-nl \
locale-libkcompactdisc-nn \
locale-libkcompactdisc-oc \
locale-libkcompactdisc-pa \
locale-libkcompactdisc-pl \
locale-libkcompactdisc-pt \
locale-libkcompactdisc-pt-BR \
locale-libkcompactdisc-ro \
locale-libkcompactdisc-ru \
locale-libkcompactdisc-sk \
locale-libkcompactdisc-sl \
locale-libkcompactdisc-sq \
locale-libkcompactdisc-sr \
locale-libkcompactdisc-sr@ijekavian \
locale-libkcompactdisc-sr@ijekavianlatin \
locale-libkcompactdisc-sr@latin \
locale-libkcompactdisc-sv \
locale-libkcompactdisc-ta \
locale-libkcompactdisc-th \
locale-libkcompactdisc-tr \
locale-libkcompactdisc-ug \
locale-libkcompactdisc-uk \
locale-libkcompactdisc-wa \
locale-libkcompactdisc-zh-CN \
locale-libkcompactdisc-zh-TW"

RDEPENDS:${PN} += "libkcompactdisc"

inherit rpm
