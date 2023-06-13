SUMMARY = "Translations for package transmission-gtk"
DESCRIPTION = "Provides translations for the 'transmission-gtk' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-gtk-lang-4.0.3-2.1.noarch.rpm"
RPM_HASH = "d6ad7802d33cf60d5b3e9ea50c7de14ea0099cfb46c3f557cbbf57793835a28992843b43ac891b9cd3aafe11a2c0e7f71dc385a07c12d296585007b55733643a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(transmission-gtk:ar) \
locale(transmission-gtk:ast) \
locale(transmission-gtk:az) \
locale(transmission-gtk:be) \
locale(transmission-gtk:bg) \
locale(transmission-gtk:bn) \
locale(transmission-gtk:br) \
locale(transmission-gtk:bs) \
locale(transmission-gtk:ca) \
locale(transmission-gtk:ca@valencia) \
locale(transmission-gtk:cs) \
locale(transmission-gtk:cy) \
locale(transmission-gtk:da) \
locale(transmission-gtk:de) \
locale(transmission-gtk:el) \
locale(transmission-gtk:eo) \
locale(transmission-gtk:es) \
locale(transmission-gtk:et) \
locale(transmission-gtk:eu) \
locale(transmission-gtk:fa) \
locale(transmission-gtk:fi) \
locale(transmission-gtk:fr) \
locale(transmission-gtk:fr_CA) \
locale(transmission-gtk:ga) \
locale(transmission-gtk:gl) \
locale(transmission-gtk:he) \
locale(transmission-gtk:hi) \
locale(transmission-gtk:hr) \
locale(transmission-gtk:hu) \
locale(transmission-gtk:ia) \
locale(transmission-gtk:id) \
locale(transmission-gtk:is) \
locale(transmission-gtk:it) \
locale(transmission-gtk:ja) \
locale(transmission-gtk:ka) \
locale(transmission-gtk:kk) \
locale(transmission-gtk:ko) \
locale(transmission-gtk:lt) \
locale(transmission-gtk:lv) \
locale(transmission-gtk:mk) \
locale(transmission-gtk:ml) \
locale(transmission-gtk:mr) \
locale(transmission-gtk:ms) \
locale(transmission-gtk:nb) \
locale(transmission-gtk:nl) \
locale(transmission-gtk:nn) \
locale(transmission-gtk:oc) \
locale(transmission-gtk:pl) \
locale(transmission-gtk:pt) \
locale(transmission-gtk:pt_BR) \
locale(transmission-gtk:pt_PT) \
locale(transmission-gtk:ro) \
locale(transmission-gtk:ru) \
locale(transmission-gtk:si) \
locale(transmission-gtk:sk) \
locale(transmission-gtk:sl) \
locale(transmission-gtk:sq) \
locale(transmission-gtk:sr) \
locale(transmission-gtk:sv) \
locale(transmission-gtk:ta) \
locale(transmission-gtk:te) \
locale(transmission-gtk:th) \
locale(transmission-gtk:tr) \
locale(transmission-gtk:ug) \
locale(transmission-gtk:uk) \
locale(transmission-gtk:vi) \
locale(transmission-gtk:zh_CN) \
locale(transmission-gtk:zh_HK) \
locale(transmission-gtk:zh_TW) \
transmission-gtk-lang \
transmission-gtk-lang-all"

RDEPENDS:${PN} += "transmission-gtk"

inherit rpm
