SUMMARY = "Translations for package polkit-gnome"
DESCRIPTION = "Provides translations for the 'polkit-gnome' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.105"

RPM_NAME = "polkit-gnome-lang-0.105-14.8.noarch.rpm"
RPM_HASH = "5b985e2a57465b6764623c71953be7b0a66463f2972d38d094367ca03c133856ed430ef7394f9b8cbdc2a724846ea50939cefd1a13bb47e919000ab7fc2edf6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(polkit-gnome:ar) \
locale(polkit-gnome:be) \
locale(polkit-gnome:bn_IN) \
locale(polkit-gnome:ca) \
locale(polkit-gnome:ca@valencia) \
locale(polkit-gnome:cs) \
locale(polkit-gnome:da) \
locale(polkit-gnome:de) \
locale(polkit-gnome:el) \
locale(polkit-gnome:en_GB) \
locale(polkit-gnome:eo) \
locale(polkit-gnome:es) \
locale(polkit-gnome:eu) \
locale(polkit-gnome:fi) \
locale(polkit-gnome:fr) \
locale(polkit-gnome:gl) \
locale(polkit-gnome:gu) \
locale(polkit-gnome:he) \
locale(polkit-gnome:hi) \
locale(polkit-gnome:hu) \
locale(polkit-gnome:id) \
locale(polkit-gnome:it) \
locale(polkit-gnome:ja) \
locale(polkit-gnome:kn) \
locale(polkit-gnome:ko) \
locale(polkit-gnome:lt) \
locale(polkit-gnome:ml) \
locale(polkit-gnome:mr) \
locale(polkit-gnome:nb) \
locale(polkit-gnome:or) \
locale(polkit-gnome:pa) \
locale(polkit-gnome:pl) \
locale(polkit-gnome:pt) \
locale(polkit-gnome:pt_BR) \
locale(polkit-gnome:ro) \
locale(polkit-gnome:ru) \
locale(polkit-gnome:sk) \
locale(polkit-gnome:sl) \
locale(polkit-gnome:sr) \
locale(polkit-gnome:sr@latin) \
locale(polkit-gnome:sv) \
locale(polkit-gnome:ta) \
locale(polkit-gnome:te) \
locale(polkit-gnome:th) \
locale(polkit-gnome:tr) \
locale(polkit-gnome:uk) \
locale(polkit-gnome:vi) \
locale(polkit-gnome:zh_CN) \
locale(polkit-gnome:zh_HK) \
locale(polkit-gnome:zh_TW) \
polkit-gnome-lang \
polkit-gnome-lang-all"

RDEPENDS:${PN} += "polkit-gnome"

inherit rpm
