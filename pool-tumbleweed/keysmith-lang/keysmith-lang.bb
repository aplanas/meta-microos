SUMMARY = "Translations for package keysmith"
DESCRIPTION = "Provides translations for the 'keysmith' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "keysmith-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f080745b50eaafbf98984e828436966d12e60f693a0bad59d7731a5ad324740340e9c4e11d5890eaf6620a78edcec954fe11e0dbefb013e8aba5b92491fe33e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keysmith-lang \
keysmith-lang-all \
locale-keysmith-ca \
locale-keysmith-ca@valencia \
locale-keysmith-cs \
locale-keysmith-de \
locale-keysmith-en-GB \
locale-keysmith-es \
locale-keysmith-et \
locale-keysmith-eu \
locale-keysmith-fi \
locale-keysmith-fr \
locale-keysmith-hu \
locale-keysmith-ia \
locale-keysmith-it \
locale-keysmith-ja \
locale-keysmith-ka \
locale-keysmith-ko \
locale-keysmith-lt \
locale-keysmith-nl \
locale-keysmith-nn \
locale-keysmith-pa \
locale-keysmith-pl \
locale-keysmith-pt \
locale-keysmith-pt-BR \
locale-keysmith-ro \
locale-keysmith-ru \
locale-keysmith-sk \
locale-keysmith-sl \
locale-keysmith-sv \
locale-keysmith-tr \
locale-keysmith-uk \
locale-keysmith-zh-CN \
locale-keysmith-zh-TW"

RDEPENDS:${PN} += "keysmith"

inherit rpm
