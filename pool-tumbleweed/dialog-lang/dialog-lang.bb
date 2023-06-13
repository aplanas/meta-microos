SUMMARY = "Translations for package dialog"
DESCRIPTION = "Provides translations for the 'dialog' package."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-lang-1.3-9.7.noarch.rpm"
RPM_HASH = "83a5345e6d1fd3f68328af31871aa19715a8590587f304c66c93801cb62a3ea6ebcc73488a5acc6a71dd2d7bcff962036c7e93fd298c54685c81a5e8a0faa4aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dialog-lang \
dialog-lang-all \
locale(dialog:ar) \
locale(dialog:ast) \
locale(dialog:be@latin) \
locale(dialog:bg) \
locale(dialog:ca) \
locale(dialog:cs) \
locale(dialog:cy) \
locale(dialog:da) \
locale(dialog:de) \
locale(dialog:el) \
locale(dialog:eo) \
locale(dialog:es) \
locale(dialog:et) \
locale(dialog:eu) \
locale(dialog:fa) \
locale(dialog:fi) \
locale(dialog:fr) \
locale(dialog:fur) \
locale(dialog:ga) \
locale(dialog:gd) \
locale(dialog:gl) \
locale(dialog:hi) \
locale(dialog:hr) \
locale(dialog:hu) \
locale(dialog:ia) \
locale(dialog:id) \
locale(dialog:is) \
locale(dialog:it) \
locale(dialog:ja) \
locale(dialog:lt) \
locale(dialog:lv) \
locale(dialog:mk) \
locale(dialog:ms) \
locale(dialog:nb) \
locale(dialog:nl) \
locale(dialog:pl) \
locale(dialog:pt) \
locale(dialog:pt_BR) \
locale(dialog:ro) \
locale(dialog:ru) \
locale(dialog:sk) \
locale(dialog:sl) \
locale(dialog:sq) \
locale(dialog:sr) \
locale(dialog:sv) \
locale(dialog:th) \
locale(dialog:tr) \
locale(dialog:uk) \
locale(dialog:vi) \
locale(dialog:wa) \
locale(dialog:zh_CN) \
locale(dialog:zh_TW)"

RDEPENDS:${PN} += "dialog"

inherit rpm
