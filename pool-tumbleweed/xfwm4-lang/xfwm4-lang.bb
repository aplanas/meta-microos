SUMMARY = "Translations for package xfwm4"
DESCRIPTION = "Provides translations for the 'xfwm4' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfwm4-lang-4.18.0-1.3.noarch.rpm"
RPM_HASH = "8d0ee3efe7fc966f91857405037589879eba552926608a3d40ab3e566511c60332f41f252380e4b531831c7eb76862d2bf1a8ebcaf8c0f9a3c9ea18989d2d96c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfwm4:ar) \
locale(xfwm4:be) \
locale(xfwm4:bg) \
locale(xfwm4:bn) \
locale(xfwm4:ca) \
locale(xfwm4:cs) \
locale(xfwm4:da) \
locale(xfwm4:de) \
locale(xfwm4:el) \
locale(xfwm4:en_AU) \
locale(xfwm4:en_CA) \
locale(xfwm4:en_GB) \
locale(xfwm4:eo) \
locale(xfwm4:es) \
locale(xfwm4:et) \
locale(xfwm4:eu) \
locale(xfwm4:fi) \
locale(xfwm4:fr) \
locale(xfwm4:gl) \
locale(xfwm4:he) \
locale(xfwm4:hr) \
locale(xfwm4:hu) \
locale(xfwm4:id) \
locale(xfwm4:is) \
locale(xfwm4:it) \
locale(xfwm4:ja) \
locale(xfwm4:ka) \
locale(xfwm4:ko) \
locale(xfwm4:lt) \
locale(xfwm4:lv) \
locale(xfwm4:ms) \
locale(xfwm4:nb) \
locale(xfwm4:nl) \
locale(xfwm4:nn) \
locale(xfwm4:oc) \
locale(xfwm4:pa) \
locale(xfwm4:pl) \
locale(xfwm4:pt) \
locale(xfwm4:pt_BR) \
locale(xfwm4:ro) \
locale(xfwm4:ru) \
locale(xfwm4:si) \
locale(xfwm4:sk) \
locale(xfwm4:sl) \
locale(xfwm4:sq) \
locale(xfwm4:sr) \
locale(xfwm4:sv) \
locale(xfwm4:te) \
locale(xfwm4:th) \
locale(xfwm4:tr) \
locale(xfwm4:ug) \
locale(xfwm4:uk) \
locale(xfwm4:vi) \
locale(xfwm4:zh_CN) \
locale(xfwm4:zh_HK) \
locale(xfwm4:zh_TW) \
xfwm4-lang \
xfwm4-lang-all"
RDEPENDS:${PN} += "xfwm4"

inherit rpm
