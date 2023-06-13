SUMMARY = "Translations for package clutter"
DESCRIPTION = "Provides translations for the 'clutter' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "clutter-lang-1.26.4-4.10.noarch.rpm"
RPM_HASH = "25a9c3c73dc097e9c84ec0808a173ca566cf38d48e5b4e1d3aee7e810e3f9364564324c4921aa43f3cccac561a315bbff21231a0743f896e815c9a15dd5c2667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clutter-lang \
clutter-lang-all \
locale(clutter:ar) \
locale(clutter:as) \
locale(clutter:ast) \
locale(clutter:be) \
locale(clutter:bg) \
locale(clutter:bs) \
locale(clutter:ca) \
locale(clutter:ca@valencia) \
locale(clutter:cs) \
locale(clutter:da) \
locale(clutter:de) \
locale(clutter:el) \
locale(clutter:en_GB) \
locale(clutter:eo) \
locale(clutter:es) \
locale(clutter:eu) \
locale(clutter:fa) \
locale(clutter:fi) \
locale(clutter:fr) \
locale(clutter:fur) \
locale(clutter:gl) \
locale(clutter:he) \
locale(clutter:hi) \
locale(clutter:hr) \
locale(clutter:hu) \
locale(clutter:id) \
locale(clutter:it) \
locale(clutter:ja) \
locale(clutter:kk) \
locale(clutter:km) \
locale(clutter:kn) \
locale(clutter:ko) \
locale(clutter:lt) \
locale(clutter:lv) \
locale(clutter:mk) \
locale(clutter:ml) \
locale(clutter:nb) \
locale(clutter:ne) \
locale(clutter:nl) \
locale(clutter:oc) \
locale(clutter:or) \
locale(clutter:pa) \
locale(clutter:pl) \
locale(clutter:pt) \
locale(clutter:pt_BR) \
locale(clutter:ro) \
locale(clutter:ru) \
locale(clutter:sk) \
locale(clutter:sl) \
locale(clutter:sr) \
locale(clutter:sr@latin) \
locale(clutter:sv) \
locale(clutter:ta) \
locale(clutter:te) \
locale(clutter:tr) \
locale(clutter:ug) \
locale(clutter:uk) \
locale(clutter:zh_CN) \
locale(clutter:zh_HK) \
locale(clutter:zh_TW)"

RDEPENDS:${PN} += "clutter"

inherit rpm
