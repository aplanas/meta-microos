SUMMARY = "Translations for package weechat"
DESCRIPTION = "Provides translations for the 'weechat' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-lang-3.8-1.1.noarch.rpm"
RPM_HASH = "87d03e093867e2add0ea5e17c140bdcb201dd810bc4d42dfaa2250f0a0ab69b8a517cd5d3e6bd2bb2146701c2aaf4dc965243da34960b73294577a4ceb61cdd7"
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
