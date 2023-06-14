SUMMARY = "Translations for package klickety"
DESCRIPTION = "Provides translations for the 'klickety' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "klickety-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "6dd8469525e323d7742c4681d778999329013e648e9fb494b0aae62b6866eafcbf0709a35028621f0fb575a5907a311d71910685614d41c4dde654e5e2c2c75e"
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
