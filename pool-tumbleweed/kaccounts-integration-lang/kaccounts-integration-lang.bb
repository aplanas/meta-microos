SUMMARY = "Translations for package kaccounts-integration"
DESCRIPTION = "Provides translations for the 'kaccounts-integration' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kaccounts-integration-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "08df8c5fe93bd79dbe1827585d889e4e306e34a6834ea3821a4a848ee15b687ca0cff1a4641fc026030b84306afcc5c916c157ef265ea3f013295ea45be51449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaccounts-integration-lang \
kaccounts-integration-lang-all \
locale-kaccounts-integration-ar \
locale-kaccounts-integration-az \
locale-kaccounts-integration-bg \
locale-kaccounts-integration-bs \
locale-kaccounts-integration-ca \
locale-kaccounts-integration-ca@valencia \
locale-kaccounts-integration-cs \
locale-kaccounts-integration-da \
locale-kaccounts-integration-de \
locale-kaccounts-integration-el \
locale-kaccounts-integration-en-GB \
locale-kaccounts-integration-es \
locale-kaccounts-integration-et \
locale-kaccounts-integration-eu \
locale-kaccounts-integration-fi \
locale-kaccounts-integration-fr \
locale-kaccounts-integration-gl \
locale-kaccounts-integration-hu \
locale-kaccounts-integration-ia \
locale-kaccounts-integration-id \
locale-kaccounts-integration-it \
locale-kaccounts-integration-ja \
locale-kaccounts-integration-ka \
locale-kaccounts-integration-ko \
locale-kaccounts-integration-lt \
locale-kaccounts-integration-nl \
locale-kaccounts-integration-nn \
locale-kaccounts-integration-pa \
locale-kaccounts-integration-pl \
locale-kaccounts-integration-pt \
locale-kaccounts-integration-pt-BR \
locale-kaccounts-integration-ro \
locale-kaccounts-integration-ru \
locale-kaccounts-integration-sk \
locale-kaccounts-integration-sl \
locale-kaccounts-integration-sr \
locale-kaccounts-integration-sr@ijekavian \
locale-kaccounts-integration-sr@ijekavianlatin \
locale-kaccounts-integration-sr@latin \
locale-kaccounts-integration-sv \
locale-kaccounts-integration-tr \
locale-kaccounts-integration-uk \
locale-kaccounts-integration-zh-CN \
locale-kaccounts-integration-zh-TW"

RDEPENDS:${PN} += "kaccounts-integration"

inherit rpm
