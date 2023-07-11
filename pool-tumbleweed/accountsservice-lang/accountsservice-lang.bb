SUMMARY = "Translations for package accountsservice"
DESCRIPTION = "Provides translations for the 'accountsservice' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-lang-23.13.9-3.1.noarch.rpm"
RPM_HASH = "b07b676740476bd78dd5b804b7fc8be09717174796800428cb065ef76a7e4fe1e115daddc67a0ddbf45e28b7868374f600d3d136ca5d18585d40c6b53c236cc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accountsservice-lang \
accountsservice-lang-all \
locale-accountsservice-af \
locale-accountsservice-ar \
locale-accountsservice-as \
locale-accountsservice-ast \
locale-accountsservice-az \
locale-accountsservice-be \
locale-accountsservice-bg \
locale-accountsservice-bn-IN \
locale-accountsservice-ca \
locale-accountsservice-ca@valencia \
locale-accountsservice-cs \
locale-accountsservice-cy \
locale-accountsservice-da \
locale-accountsservice-de \
locale-accountsservice-el \
locale-accountsservice-en \
locale-accountsservice-en-GB \
locale-accountsservice-eo \
locale-accountsservice-es \
locale-accountsservice-et \
locale-accountsservice-eu \
locale-accountsservice-fa \
locale-accountsservice-fi \
locale-accountsservice-fr \
locale-accountsservice-fur \
locale-accountsservice-ga \
locale-accountsservice-gl \
locale-accountsservice-gu \
locale-accountsservice-he \
locale-accountsservice-hi \
locale-accountsservice-hr \
locale-accountsservice-hu \
locale-accountsservice-ia \
locale-accountsservice-id \
locale-accountsservice-it \
locale-accountsservice-ja \
locale-accountsservice-ka \
locale-accountsservice-kk \
locale-accountsservice-kn \
locale-accountsservice-ko \
locale-accountsservice-lt \
locale-accountsservice-lv \
locale-accountsservice-ml \
locale-accountsservice-mr \
locale-accountsservice-ms \
locale-accountsservice-nb \
locale-accountsservice-nl \
locale-accountsservice-nn \
locale-accountsservice-oc \
locale-accountsservice-or \
locale-accountsservice-pa \
locale-accountsservice-pl \
locale-accountsservice-pt \
locale-accountsservice-pt-BR \
locale-accountsservice-ro \
locale-accountsservice-ru \
locale-accountsservice-sk \
locale-accountsservice-sl \
locale-accountsservice-sq \
locale-accountsservice-sr \
locale-accountsservice-sr@latin \
locale-accountsservice-sv \
locale-accountsservice-ta \
locale-accountsservice-te \
locale-accountsservice-th \
locale-accountsservice-tr \
locale-accountsservice-uk \
locale-accountsservice-vi \
locale-accountsservice-wa \
locale-accountsservice-zh-CN \
locale-accountsservice-zh-HK \
locale-accountsservice-zh-TW"

RDEPENDS:${PN} += "accountsservice"

inherit rpm
