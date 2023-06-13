SUMMARY = "Translations for package lxtask"
DESCRIPTION = "Provides translations for the 'lxtask' package."
LICENSE = "GPL-2.0-only"

PV = "0.1.10"

RPM_NAME = "lxtask-lang-0.1.10-1.11.noarch.rpm"
RPM_HASH = "2900fa095307fe883092b150f79861fc78b85f169f622844e944e03ea1df5ea571e7c8bfa16e5795f0e0ad743ef46c3832d6398c3009dfb8767660fa2c71f53d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lxtask:af) \
locale(lxtask:ar) \
locale(lxtask:ast) \
locale(lxtask:be) \
locale(lxtask:bg) \
locale(lxtask:bn) \
locale(lxtask:bn_IN) \
locale(lxtask:ca) \
locale(lxtask:cs) \
locale(lxtask:da) \
locale(lxtask:de) \
locale(lxtask:el) \
locale(lxtask:en_GB) \
locale(lxtask:es) \
locale(lxtask:et) \
locale(lxtask:eu) \
locale(lxtask:fa) \
locale(lxtask:fi) \
locale(lxtask:fr) \
locale(lxtask:gl) \
locale(lxtask:he) \
locale(lxtask:hr) \
locale(lxtask:hu) \
locale(lxtask:id) \
locale(lxtask:is) \
locale(lxtask:it) \
locale(lxtask:ja) \
locale(lxtask:kk) \
locale(lxtask:ko) \
locale(lxtask:lt) \
locale(lxtask:lv) \
locale(lxtask:ml) \
locale(lxtask:ms) \
locale(lxtask:nb) \
locale(lxtask:nl) \
locale(lxtask:nn) \
locale(lxtask:pa) \
locale(lxtask:pl) \
locale(lxtask:pt) \
locale(lxtask:pt_BR) \
locale(lxtask:ro) \
locale(lxtask:ru) \
locale(lxtask:sk) \
locale(lxtask:sl) \
locale(lxtask:sq) \
locale(lxtask:sr) \
locale(lxtask:sr@latin) \
locale(lxtask:sv) \
locale(lxtask:te) \
locale(lxtask:th) \
locale(lxtask:tr) \
locale(lxtask:ug) \
locale(lxtask:uk) \
locale(lxtask:vi) \
locale(lxtask:zh_CN) \
locale(lxtask:zh_TW) \
lxtask-lang \
lxtask-lang-all"

RDEPENDS:${PN} += "lxtask"

inherit rpm
