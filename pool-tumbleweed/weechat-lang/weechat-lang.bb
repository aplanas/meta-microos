SUMMARY = "Translations for package weechat"
DESCRIPTION = "Provides translations for the 'weechat' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-lang-4.0.2-1.1.noarch.rpm"
RPM_HASH = "0f28226818376cad328c6a66f92933c43b561eff8bb1a06def9453b7929beda5fc9294320731e1f9e1a0016b634c50626d7df867653a3efd279c743dbca593f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-weechat-cs \
locale-weechat-de \
locale-weechat-es \
locale-weechat-fr \
locale-weechat-hu \
locale-weechat-it \
locale-weechat-ja \
locale-weechat-pl \
locale-weechat-pt \
locale-weechat-pt-BR \
locale-weechat-ru \
locale-weechat-sr \
locale-weechat-tr \
weechat-lang \
weechat-lang-all"

RDEPENDS:${PN} += "weechat"

inherit rpm
