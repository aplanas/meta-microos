SUMMARY = "Translations for package kalzium"
DESCRIPTION = "Provides translations for the 'kalzium' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalzium-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "8910984a9997092132919df8cc67e9a3d7c90b16fc876c6ef46747c9c1d02a8250dee3d684763ae01226b9e0241f0162c23e2d84cd6d09e70476b5d9c6f482ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalzium-lang \
kalzium-lang-all \
locale(kalzium:af) \
locale(kalzium:ar) \
locale(kalzium:be) \
locale(kalzium:bg) \
locale(kalzium:bn) \
locale(kalzium:br) \
locale(kalzium:bs) \
locale(kalzium:ca) \
locale(kalzium:ca@valencia) \
locale(kalzium:cs) \
locale(kalzium:cy) \
locale(kalzium:da) \
locale(kalzium:de) \
locale(kalzium:el) \
locale(kalzium:en_GB) \
locale(kalzium:eo) \
locale(kalzium:es) \
locale(kalzium:et) \
locale(kalzium:eu) \
locale(kalzium:fa) \
locale(kalzium:fi) \
locale(kalzium:fr) \
locale(kalzium:ga) \
locale(kalzium:gl) \
locale(kalzium:gu) \
locale(kalzium:he) \
locale(kalzium:hi) \
locale(kalzium:hr) \
locale(kalzium:hu) \
locale(kalzium:is) \
locale(kalzium:it) \
locale(kalzium:ja) \
locale(kalzium:ka) \
locale(kalzium:kk) \
locale(kalzium:km) \
locale(kalzium:ko) \
locale(kalzium:lt) \
locale(kalzium:lv) \
locale(kalzium:mai) \
locale(kalzium:mk) \
locale(kalzium:ml) \
locale(kalzium:mr) \
locale(kalzium:ms) \
locale(kalzium:nb) \
locale(kalzium:nds) \
locale(kalzium:ne) \
locale(kalzium:nl) \
locale(kalzium:nn) \
locale(kalzium:oc) \
locale(kalzium:pa) \
locale(kalzium:pl) \
locale(kalzium:pt) \
locale(kalzium:pt_BR) \
locale(kalzium:ro) \
locale(kalzium:ru) \
locale(kalzium:si) \
locale(kalzium:sk) \
locale(kalzium:sl) \
locale(kalzium:sq) \
locale(kalzium:sv) \
locale(kalzium:ta) \
locale(kalzium:th) \
locale(kalzium:tr) \
locale(kalzium:ug) \
locale(kalzium:uk) \
locale(kalzium:zh_CN) \
locale(kalzium:zh_TW)"

RDEPENDS:${PN} += "kalzium"

inherit rpm
