SUMMARY = "Translations for package lightdm"
DESCRIPTION = "Provides translations for the 'lightdm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-lang-1.32.0-2.2.noarch.rpm"
RPM_HASH = "5654ced9a4f72dd4ab1f725a860cc76b5b24a37f9496bf60646aacb03465fbb41fd2200c9c4357201327469a9c3a1b874136d0426fee9e9705ea3f5332ea246c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-lang \
lightdm-lang-all \
locale(lightdm:af) \
locale(lightdm:ar) \
locale(lightdm:ast) \
locale(lightdm:az) \
locale(lightdm:be) \
locale(lightdm:bg) \
locale(lightdm:bn) \
locale(lightdm:br) \
locale(lightdm:bs) \
locale(lightdm:ca) \
locale(lightdm:ca@valencia) \
locale(lightdm:cs) \
locale(lightdm:da) \
locale(lightdm:de) \
locale(lightdm:el) \
locale(lightdm:en_AU) \
locale(lightdm:en_CA) \
locale(lightdm:en_GB) \
locale(lightdm:eo) \
locale(lightdm:es) \
locale(lightdm:et) \
locale(lightdm:eu) \
locale(lightdm:fa) \
locale(lightdm:fi) \
locale(lightdm:fr) \
locale(lightdm:gd) \
locale(lightdm:gl) \
locale(lightdm:gu) \
locale(lightdm:he) \
locale(lightdm:hi) \
locale(lightdm:hr) \
locale(lightdm:hu) \
locale(lightdm:ia) \
locale(lightdm:id) \
locale(lightdm:is) \
locale(lightdm:it) \
locale(lightdm:ja) \
locale(lightdm:kk) \
locale(lightdm:km) \
locale(lightdm:kn) \
locale(lightdm:ko) \
locale(lightdm:lt) \
locale(lightdm:lv) \
locale(lightdm:ml) \
locale(lightdm:mr) \
locale(lightdm:ms) \
locale(lightdm:nb) \
locale(lightdm:nl) \
locale(lightdm:nn) \
locale(lightdm:oc) \
locale(lightdm:pa) \
locale(lightdm:pl) \
locale(lightdm:pt) \
locale(lightdm:pt_BR) \
locale(lightdm:ro) \
locale(lightdm:ru) \
locale(lightdm:si) \
locale(lightdm:sk) \
locale(lightdm:sl) \
locale(lightdm:sq) \
locale(lightdm:sr) \
locale(lightdm:sv) \
locale(lightdm:ta) \
locale(lightdm:te) \
locale(lightdm:th) \
locale(lightdm:tr) \
locale(lightdm:ug) \
locale(lightdm:uk) \
locale(lightdm:vi) \
locale(lightdm:zh_CN) \
locale(lightdm:zh_HK) \
locale(lightdm:zh_TW)"

RDEPENDS:${PN} += "lightdm"

inherit rpm
