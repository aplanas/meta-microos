SUMMARY = "Translations for package klickety"
DESCRIPTION = "Provides translations for the 'klickety' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "klickety-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "ba42dbfdd49df61212f5c732dbc1242fb9aa290cbdaad39fcb6f075a124038027bbe3a84b5f4a7ae2b8489626f85916e2418451068713a955095b067a3dc3679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klickety-lang \
klickety-lang-all \
locale-klickety-bg \
locale-klickety-bs \
locale-klickety-ca \
locale-klickety-ca@valencia \
locale-klickety-cs \
locale-klickety-da \
locale-klickety-de \
locale-klickety-el \
locale-klickety-en-GB \
locale-klickety-es \
locale-klickety-et \
locale-klickety-eu \
locale-klickety-fi \
locale-klickety-fr \
locale-klickety-ga \
locale-klickety-gl \
locale-klickety-hu \
locale-klickety-id \
locale-klickety-is \
locale-klickety-it \
locale-klickety-ja \
locale-klickety-ka \
locale-klickety-kk \
locale-klickety-ko \
locale-klickety-lt \
locale-klickety-lv \
locale-klickety-mai \
locale-klickety-ml \
locale-klickety-mr \
locale-klickety-nb \
locale-klickety-nds \
locale-klickety-nl \
locale-klickety-nn \
locale-klickety-pl \
locale-klickety-pt \
locale-klickety-pt-BR \
locale-klickety-ro \
locale-klickety-ru \
locale-klickety-sk \
locale-klickety-sl \
locale-klickety-sr \
locale-klickety-sr@ijekavian \
locale-klickety-sr@ijekavianlatin \
locale-klickety-sr@latin \
locale-klickety-sv \
locale-klickety-tr \
locale-klickety-ug \
locale-klickety-uk \
locale-klickety-zh-CN \
locale-klickety-zh-TW"

RDEPENDS:${PN} += "klickety"

inherit rpm
