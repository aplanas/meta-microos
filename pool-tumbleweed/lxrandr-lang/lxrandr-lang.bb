SUMMARY = "Translations for package lxrandr"
DESCRIPTION = "Provides translations for the 'lxrandr' package."
LICENSE = "GPL-2.0-only"

PV = "0.3.2"

RPM_NAME = "lxrandr-lang-0.3.2-1.14.noarch.rpm"
RPM_HASH = "75fdbb1d0b880b2bf15059e75f10fd1f1a19337f49b2f392caab96619f5ac672a5c8a18e77ebd1d6cbccb27214cd752ac2b14daf8b43be8ad47d23c644463fb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lxrandr:af) \
locale(lxrandr:ar) \
locale(lxrandr:ast) \
locale(lxrandr:be) \
locale(lxrandr:bg) \
locale(lxrandr:bn) \
locale(lxrandr:bn_IN) \
locale(lxrandr:ca) \
locale(lxrandr:cs) \
locale(lxrandr:da) \
locale(lxrandr:de) \
locale(lxrandr:el) \
locale(lxrandr:en_GB) \
locale(lxrandr:es) \
locale(lxrandr:et) \
locale(lxrandr:eu) \
locale(lxrandr:fa) \
locale(lxrandr:fi) \
locale(lxrandr:fr) \
locale(lxrandr:gl) \
locale(lxrandr:he) \
locale(lxrandr:hr) \
locale(lxrandr:hu) \
locale(lxrandr:id) \
locale(lxrandr:is) \
locale(lxrandr:it) \
locale(lxrandr:ja) \
locale(lxrandr:kk) \
locale(lxrandr:ko) \
locale(lxrandr:lt) \
locale(lxrandr:ml) \
locale(lxrandr:ms) \
locale(lxrandr:nb) \
locale(lxrandr:nl) \
locale(lxrandr:nn) \
locale(lxrandr:pa) \
locale(lxrandr:pl) \
locale(lxrandr:pt) \
locale(lxrandr:pt_BR) \
locale(lxrandr:ro) \
locale(lxrandr:ru) \
locale(lxrandr:sk) \
locale(lxrandr:sl) \
locale(lxrandr:sr) \
locale(lxrandr:sr@latin) \
locale(lxrandr:sv) \
locale(lxrandr:te) \
locale(lxrandr:th) \
locale(lxrandr:tr) \
locale(lxrandr:ug) \
locale(lxrandr:uk) \
locale(lxrandr:vi) \
locale(lxrandr:zh_CN) \
locale(lxrandr:zh_TW) \
lxrandr-lang \
lxrandr-lang-all"

RDEPENDS:${PN} += "lxrandr"

inherit rpm
