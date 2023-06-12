SUMMARY = "Translations for package vinagre"
DESCRIPTION = "Provides translations for the 'vinagre' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.0"

RPM_NAME = "vinagre-lang-3.22.0-15.10.noarch.rpm"
RPM_HASH = "34283abb4bff8f06156b46f7f2f5623c8e8b417db655e38f01ad1b36b7937ab5f8f9ffe46458963961ecc654b3da1e50a2f12740f59608865678b6d10a5bfca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(vinagre:ar) \
locale(vinagre:as) \
locale(vinagre:ast) \
locale(vinagre:be) \
locale(vinagre:be@latin) \
locale(vinagre:bg) \
locale(vinagre:bn) \
locale(vinagre:bn_IN) \
locale(vinagre:bs) \
locale(vinagre:ca) \
locale(vinagre:ca@valencia) \
locale(vinagre:cs) \
locale(vinagre:da) \
locale(vinagre:de) \
locale(vinagre:el) \
locale(vinagre:en@shaw) \
locale(vinagre:en_GB) \
locale(vinagre:eo) \
locale(vinagre:es) \
locale(vinagre:et) \
locale(vinagre:eu) \
locale(vinagre:fa) \
locale(vinagre:fi) \
locale(vinagre:fr) \
locale(vinagre:fur) \
locale(vinagre:ga) \
locale(vinagre:gl) \
locale(vinagre:gu) \
locale(vinagre:he) \
locale(vinagre:hi) \
locale(vinagre:hu) \
locale(vinagre:id) \
locale(vinagre:is) \
locale(vinagre:it) \
locale(vinagre:ja) \
locale(vinagre:kk) \
locale(vinagre:kn) \
locale(vinagre:ko) \
locale(vinagre:lt) \
locale(vinagre:lv) \
locale(vinagre:mai) \
locale(vinagre:mk) \
locale(vinagre:ml) \
locale(vinagre:mr) \
locale(vinagre:ms) \
locale(vinagre:nb) \
locale(vinagre:ne) \
locale(vinagre:nl) \
locale(vinagre:nn) \
locale(vinagre:oc) \
locale(vinagre:or) \
locale(vinagre:pa) \
locale(vinagre:pl) \
locale(vinagre:pt) \
locale(vinagre:pt_BR) \
locale(vinagre:ro) \
locale(vinagre:ru) \
locale(vinagre:si) \
locale(vinagre:sk) \
locale(vinagre:sl) \
locale(vinagre:sq) \
locale(vinagre:sr) \
locale(vinagre:sr@latin) \
locale(vinagre:sv) \
locale(vinagre:ta) \
locale(vinagre:te) \
locale(vinagre:th) \
locale(vinagre:tr) \
locale(vinagre:ug) \
locale(vinagre:uk) \
locale(vinagre:vi) \
locale(vinagre:zh_CN) \
locale(vinagre:zh_HK) \
locale(vinagre:zh_TW) \
vinagre-lang \
vinagre-lang-all"
RDEPENDS:${PN} += "vinagre"

inherit rpm
