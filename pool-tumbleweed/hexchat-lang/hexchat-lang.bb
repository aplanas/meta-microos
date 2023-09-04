SUMMARY = "Translations for package hexchat"
DESCRIPTION = "Provides translations for the 'hexchat' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-lang-2.16.1-2.8.noarch.rpm"
RPM_HASH = "66d7619e686040d719344b760db860a0107a131fe92266d6650843437ce8e78060cf72e99a8b417570d78f9c00ad84e58fdc96cc76c60c3311cc5be851f3ae20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hexchat-lang \
hexchat-lang-all \
locale-hexchat-af \
locale-hexchat-ast \
locale-hexchat-az \
locale-hexchat-be \
locale-hexchat-bg \
locale-hexchat-ca \
locale-hexchat-cs \
locale-hexchat-da \
locale-hexchat-de \
locale-hexchat-el \
locale-hexchat-en-GB \
locale-hexchat-es \
locale-hexchat-et \
locale-hexchat-eu \
locale-hexchat-fi \
locale-hexchat-fr \
locale-hexchat-gl \
locale-hexchat-gu \
locale-hexchat-hi \
locale-hexchat-hu \
locale-hexchat-id \
locale-hexchat-it \
locale-hexchat-kn \
locale-hexchat-ko \
locale-hexchat-lt \
locale-hexchat-lv \
locale-hexchat-mk \
locale-hexchat-ml \
locale-hexchat-ms \
locale-hexchat-nb \
locale-hexchat-nl \
locale-hexchat-pa \
locale-hexchat-pl \
locale-hexchat-pt \
locale-hexchat-pt-BR \
locale-hexchat-ru \
locale-hexchat-sk \
locale-hexchat-sl \
locale-hexchat-sq \
locale-hexchat-sr \
locale-hexchat-sr@latin \
locale-hexchat-sv \
locale-hexchat-th \
locale-hexchat-tr \
locale-hexchat-uk \
locale-hexchat-vi \
locale-hexchat-wa \
locale-hexchat-zh-CN \
locale-hexchat-zh-TW"

RDEPENDS:${PN} += "hexchat"

inherit rpm
