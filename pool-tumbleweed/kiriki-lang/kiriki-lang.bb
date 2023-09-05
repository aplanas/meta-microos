SUMMARY = "Translations for package kiriki"
DESCRIPTION = "Provides translations for the 'kiriki' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kiriki-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "60d34cbb952fc3c254d7eb477552b936bb3b38ab203ec4535c438ed9822e70dc1ad6852f8bb5834a2637f7bd99b161c399dc5c741464ba70fe62a78dba34ee6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiriki-lang \
kiriki-lang-all \
locale-kiriki-ar \
locale-kiriki-be \
locale-kiriki-bg \
locale-kiriki-bs \
locale-kiriki-ca \
locale-kiriki-ca@valencia \
locale-kiriki-cs \
locale-kiriki-da \
locale-kiriki-de \
locale-kiriki-el \
locale-kiriki-en-GB \
locale-kiriki-eo \
locale-kiriki-es \
locale-kiriki-et \
locale-kiriki-eu \
locale-kiriki-fi \
locale-kiriki-fr \
locale-kiriki-ga \
locale-kiriki-gl \
locale-kiriki-hi \
locale-kiriki-hr \
locale-kiriki-hu \
locale-kiriki-id \
locale-kiriki-is \
locale-kiriki-it \
locale-kiriki-ja \
locale-kiriki-ka \
locale-kiriki-kk \
locale-kiriki-km \
locale-kiriki-ko \
locale-kiriki-lt \
locale-kiriki-lv \
locale-kiriki-mai \
locale-kiriki-ml \
locale-kiriki-mr \
locale-kiriki-nb \
locale-kiriki-nds \
locale-kiriki-nl \
locale-kiriki-nn \
locale-kiriki-oc \
locale-kiriki-pl \
locale-kiriki-pt \
locale-kiriki-pt-BR \
locale-kiriki-ro \
locale-kiriki-ru \
locale-kiriki-sk \
locale-kiriki-sl \
locale-kiriki-sr \
locale-kiriki-sr@ijekavian \
locale-kiriki-sr@ijekavianlatin \
locale-kiriki-sr@latin \
locale-kiriki-sv \
locale-kiriki-tr \
locale-kiriki-ug \
locale-kiriki-uk \
locale-kiriki-zh-CN \
locale-kiriki-zh-TW"

RDEPENDS:${PN} += "kiriki"

inherit rpm
