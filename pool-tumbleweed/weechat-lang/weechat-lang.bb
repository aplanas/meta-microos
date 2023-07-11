SUMMARY = "Translations for package weechat"
DESCRIPTION = "Provides translations for the 'weechat' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-lang-3.8-1.3.noarch.rpm"
RPM_HASH = "a1f776a1f2c1644dc29a70bca94ee15e2fbf6feec76edb015c5579b43b40330e4511b995ad40cd6dc3ff06deb9fce9fa08069de03b4cc63074b898754f8c4169"
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
