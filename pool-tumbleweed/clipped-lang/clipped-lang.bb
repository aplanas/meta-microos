SUMMARY = "Translations for package clipped"
DESCRIPTION = "Provides translations for the 'clipped' package."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "clipped-lang-1.1.1-1.18.noarch.rpm"
RPM_HASH = "ab92f8c7da8e36f7d5a44842552962201400b80138f5336efad2c7279fb0b6a8b4f455ff0e8882d8a1565398eb2832818047cbe9ad14701da8c9795790b80935"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clipped-lang \
clipped-lang-all \
locale(clipped:af) \
locale(clipped:ar) \
locale(clipped:as) \
locale(clipped:ast) \
locale(clipped:az) \
locale(clipped:be) \
locale(clipped:bg) \
locale(clipped:bn) \
locale(clipped:br) \
locale(clipped:bs) \
locale(clipped:ca) \
locale(clipped:cs) \
locale(clipped:cy) \
locale(clipped:da) \
locale(clipped:de) \
locale(clipped:dz) \
locale(clipped:el) \
locale(clipped:en_AU) \
locale(clipped:en_CA) \
locale(clipped:en_GB) \
locale(clipped:eo) \
locale(clipped:es) \
locale(clipped:et) \
locale(clipped:eu) \
locale(clipped:fa) \
locale(clipped:fi) \
locale(clipped:fr) \
locale(clipped:fr_CA) \
locale(clipped:ga) \
locale(clipped:gd) \
locale(clipped:gl) \
locale(clipped:gu) \
locale(clipped:he) \
locale(clipped:hi) \
locale(clipped:hr) \
locale(clipped:hu) \
locale(clipped:ia) \
locale(clipped:id) \
locale(clipped:is) \
locale(clipped:it) \
locale(clipped:ja) \
locale(clipped:ka) \
locale(clipped:kk) \
locale(clipped:km) \
locale(clipped:kn) \
locale(clipped:ko) \
locale(clipped:lt) \
locale(clipped:lv) \
locale(clipped:mk) \
locale(clipped:ml) \
locale(clipped:mr) \
locale(clipped:ms) \
locale(clipped:nb) \
locale(clipped:ne) \
locale(clipped:nl) \
locale(clipped:nn) \
locale(clipped:oc) \
locale(clipped:or) \
locale(clipped:pa) \
locale(clipped:pl) \
locale(clipped:pt) \
locale(clipped:pt_BR) \
locale(clipped:ro) \
locale(clipped:ru) \
locale(clipped:si) \
locale(clipped:sk) \
locale(clipped:sl) \
locale(clipped:sq) \
locale(clipped:sr) \
locale(clipped:sv) \
locale(clipped:ta) \
locale(clipped:te) \
locale(clipped:th) \
locale(clipped:tr) \
locale(clipped:ug) \
locale(clipped:uk) \
locale(clipped:vi) \
locale(clipped:wa) \
locale(clipped:zh) \
locale(clipped:zh_HK) \
locale(clipped:zh_TW)"

RDEPENDS:${PN} += "clipped"

inherit rpm
