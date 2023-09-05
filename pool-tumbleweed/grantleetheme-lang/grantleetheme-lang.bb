SUMMARY = "Translations for package grantleetheme"
DESCRIPTION = "Provides translations for the 'grantleetheme' package."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "grantleetheme-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "62298a78ff6c09a613634cc8b471ecd1faf250818113b62aafbf4fbcd18a5557f8ee42e2503c08f9c09622882672233bb702f189e1cd83ca1e88dc408452aeaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantleetheme-lang \
grantleetheme-lang-all \
locale-grantleetheme-ar \
locale-grantleetheme-bg \
locale-grantleetheme-bs \
locale-grantleetheme-ca \
locale-grantleetheme-ca@valencia \
locale-grantleetheme-cs \
locale-grantleetheme-da \
locale-grantleetheme-de \
locale-grantleetheme-el \
locale-grantleetheme-en-GB \
locale-grantleetheme-eo \
locale-grantleetheme-es \
locale-grantleetheme-et \
locale-grantleetheme-eu \
locale-grantleetheme-fi \
locale-grantleetheme-fr \
locale-grantleetheme-gl \
locale-grantleetheme-hi \
locale-grantleetheme-hu \
locale-grantleetheme-ia \
locale-grantleetheme-it \
locale-grantleetheme-ja \
locale-grantleetheme-ka \
locale-grantleetheme-kk \
locale-grantleetheme-ko \
locale-grantleetheme-lt \
locale-grantleetheme-nb \
locale-grantleetheme-nds \
locale-grantleetheme-nl \
locale-grantleetheme-nn \
locale-grantleetheme-pl \
locale-grantleetheme-pt \
locale-grantleetheme-pt-BR \
locale-grantleetheme-ro \
locale-grantleetheme-ru \
locale-grantleetheme-sk \
locale-grantleetheme-sl \
locale-grantleetheme-sr \
locale-grantleetheme-sr@ijekavian \
locale-grantleetheme-sr@ijekavianlatin \
locale-grantleetheme-sr@latin \
locale-grantleetheme-sv \
locale-grantleetheme-tr \
locale-grantleetheme-ug \
locale-grantleetheme-uk \
locale-grantleetheme-zh-CN \
locale-grantleetheme-zh-TW"

RDEPENDS:${PN} += "grantleetheme"

inherit rpm
