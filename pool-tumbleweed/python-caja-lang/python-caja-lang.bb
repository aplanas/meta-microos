SUMMARY = "Translations for package python-caja"
DESCRIPTION = "Provides translations for the 'python-caja' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "python-caja-lang-1.26.0-1.10.noarch.rpm"
RPM_HASH = "d6e5ab1fc354571546c1e28d46a6ce24949715369ac919042e6456562edb8fb8f8ac248b8312c8ff7819cbbf874a5390a6a9c81704e671d0a831bc19d31aa7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(python-caja:ar) \
locale(python-caja:ast) \
locale(python-caja:be) \
locale(python-caja:bg) \
locale(python-caja:br) \
locale(python-caja:bs) \
locale(python-caja:ca) \
locale(python-caja:ca@valencia) \
locale(python-caja:cs) \
locale(python-caja:cy) \
locale(python-caja:da) \
locale(python-caja:de) \
locale(python-caja:el) \
locale(python-caja:en_AU) \
locale(python-caja:en_GB) \
locale(python-caja:eo) \
locale(python-caja:es) \
locale(python-caja:es_AR) \
locale(python-caja:es_CL) \
locale(python-caja:es_CO) \
locale(python-caja:es_ES) \
locale(python-caja:et) \
locale(python-caja:eu) \
locale(python-caja:fa) \
locale(python-caja:fi) \
locale(python-caja:fr) \
locale(python-caja:fr_CA) \
locale(python-caja:gl) \
locale(python-caja:gu) \
locale(python-caja:he) \
locale(python-caja:hi) \
locale(python-caja:hr) \
locale(python-caja:hu) \
locale(python-caja:id) \
locale(python-caja:is) \
locale(python-caja:it) \
locale(python-caja:ja) \
locale(python-caja:kk) \
locale(python-caja:ko) \
locale(python-caja:lt) \
locale(python-caja:lv) \
locale(python-caja:ms) \
locale(python-caja:nb) \
locale(python-caja:nds) \
locale(python-caja:ne) \
locale(python-caja:nl) \
locale(python-caja:oc) \
locale(python-caja:pl) \
locale(python-caja:pt) \
locale(python-caja:pt_BR) \
locale(python-caja:ro) \
locale(python-caja:ru) \
locale(python-caja:sk) \
locale(python-caja:sl) \
locale(python-caja:sq) \
locale(python-caja:sr) \
locale(python-caja:sv) \
locale(python-caja:th) \
locale(python-caja:tr) \
locale(python-caja:uk) \
locale(python-caja:vi) \
locale(python-caja:zh_CN) \
locale(python-caja:zh_HK) \
locale(python-caja:zh_TW) \
python-caja-lang \
python-caja-lang-all"

RDEPENDS:${PN} += "python-caja"

inherit rpm
