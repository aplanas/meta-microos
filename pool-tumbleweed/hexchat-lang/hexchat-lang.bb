SUMMARY = "Translations for package hexchat"
DESCRIPTION = "Provides translations for the 'hexchat' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-lang-2.16.1-2.4.noarch.rpm"
RPM_HASH = "05bf8298a5dc373d83a69a937df0f603de34739cf7ae79236c24ebd20bb61042ee6a699f26da7b759ff1d2fed87e68103160a94201da58c0c0803a04428b9196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hexchat-lang \
hexchat-lang-all \
locale(hexchat:af) \
locale(hexchat:ast) \
locale(hexchat:az) \
locale(hexchat:be) \
locale(hexchat:bg) \
locale(hexchat:ca) \
locale(hexchat:cs) \
locale(hexchat:da) \
locale(hexchat:de) \
locale(hexchat:el) \
locale(hexchat:en_GB) \
locale(hexchat:es) \
locale(hexchat:et) \
locale(hexchat:eu) \
locale(hexchat:fi) \
locale(hexchat:fr) \
locale(hexchat:gl) \
locale(hexchat:gu) \
locale(hexchat:hi) \
locale(hexchat:hu) \
locale(hexchat:id) \
locale(hexchat:it) \
locale(hexchat:kn) \
locale(hexchat:ko) \
locale(hexchat:lt) \
locale(hexchat:lv) \
locale(hexchat:mk) \
locale(hexchat:ml) \
locale(hexchat:ms) \
locale(hexchat:nb) \
locale(hexchat:nl) \
locale(hexchat:pa) \
locale(hexchat:pl) \
locale(hexchat:pt) \
locale(hexchat:pt_BR) \
locale(hexchat:ru) \
locale(hexchat:sk) \
locale(hexchat:sl) \
locale(hexchat:sq) \
locale(hexchat:sr) \
locale(hexchat:sr@latin) \
locale(hexchat:sv) \
locale(hexchat:th) \
locale(hexchat:tr) \
locale(hexchat:uk) \
locale(hexchat:vi) \
locale(hexchat:wa) \
locale(hexchat:zh_CN) \
locale(hexchat:zh_TW)"

RDEPENDS:${PN} += "hexchat"

inherit rpm
