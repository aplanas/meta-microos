SUMMARY = "Translations for package gnome-sound-recorder"
DESCRIPTION = "Provides translations for the 'gnome-sound-recorder' package."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "43.beta"

RPM_NAME = "gnome-sound-recorder-lang-43.beta-1.2.noarch.rpm"
RPM_HASH = "b08331dfb0fc59c332585ee26e09266efaf524022735ef20531f5218fdcf576578a386d719fd303e3934f2dbdfdc4deded743b6278a6540ffc44e911388d1dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-sound-recorder-lang \
gnome-sound-recorder-lang-all \
locale(gnome-sound-recorder:af) \
locale(gnome-sound-recorder:ar) \
locale(gnome-sound-recorder:as) \
locale(gnome-sound-recorder:be) \
locale(gnome-sound-recorder:bs) \
locale(gnome-sound-recorder:ca) \
locale(gnome-sound-recorder:ca@valencia) \
locale(gnome-sound-recorder:cs) \
locale(gnome-sound-recorder:da) \
locale(gnome-sound-recorder:de) \
locale(gnome-sound-recorder:el) \
locale(gnome-sound-recorder:en_GB) \
locale(gnome-sound-recorder:eo) \
locale(gnome-sound-recorder:es) \
locale(gnome-sound-recorder:eu) \
locale(gnome-sound-recorder:fa) \
locale(gnome-sound-recorder:fi) \
locale(gnome-sound-recorder:fr) \
locale(gnome-sound-recorder:fur) \
locale(gnome-sound-recorder:gl) \
locale(gnome-sound-recorder:he) \
locale(gnome-sound-recorder:hr) \
locale(gnome-sound-recorder:hu) \
locale(gnome-sound-recorder:id) \
locale(gnome-sound-recorder:is) \
locale(gnome-sound-recorder:it) \
locale(gnome-sound-recorder:ja) \
locale(gnome-sound-recorder:kk) \
locale(gnome-sound-recorder:ko) \
locale(gnome-sound-recorder:lt) \
locale(gnome-sound-recorder:lv) \
locale(gnome-sound-recorder:ml) \
locale(gnome-sound-recorder:ms) \
locale(gnome-sound-recorder:nb) \
locale(gnome-sound-recorder:ne) \
locale(gnome-sound-recorder:nl) \
locale(gnome-sound-recorder:oc) \
locale(gnome-sound-recorder:pa) \
locale(gnome-sound-recorder:pl) \
locale(gnome-sound-recorder:pt) \
locale(gnome-sound-recorder:pt_BR) \
locale(gnome-sound-recorder:ro) \
locale(gnome-sound-recorder:ru) \
locale(gnome-sound-recorder:sk) \
locale(gnome-sound-recorder:sl) \
locale(gnome-sound-recorder:sr) \
locale(gnome-sound-recorder:sr@latin) \
locale(gnome-sound-recorder:sv) \
locale(gnome-sound-recorder:te) \
locale(gnome-sound-recorder:tr) \
locale(gnome-sound-recorder:uk) \
locale(gnome-sound-recorder:vi) \
locale(gnome-sound-recorder:zh_CN) \
locale(gnome-sound-recorder:zh_HK) \
locale(gnome-sound-recorder:zh_TW)"

RDEPENDS:${PN} += "gnome-sound-recorder"

inherit rpm
