SUMMARY = "Translations for package libkcompactdisc"
DESCRIPTION = "Provides translations for the 'libkcompactdisc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkcompactdisc-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "f72326c601809b677d3cc791a9798aa73d6e7aee765e270a32b681cded02e6fa3c8f024b8835c5630f8d7d8d55872fb03b7b87bb9e88a30324548a43d00dfcf8"
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
