SUMMARY = "Translations for package aisleriot"
DESCRIPTION = "Provides translations for the 'aisleriot' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.29"

RPM_NAME = "aisleriot-lang-3.22.29-1.1.noarch.rpm"
RPM_HASH = "730884761c811ecb5e34b679bc87db4a32a0e852f9665baac93e7c7b6b3907eeef87f9f929f105cafffa067c971381d499c2a7affafa97e5e20b36d1267389ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aisleriot-lang \
aisleriot-lang-all \
locale(aisleriot:af) \
locale(aisleriot:ar) \
locale(aisleriot:as) \
locale(aisleriot:ast) \
locale(aisleriot:az) \
locale(aisleriot:be) \
locale(aisleriot:bg) \
locale(aisleriot:bn) \
locale(aisleriot:bn_IN) \
locale(aisleriot:br) \
locale(aisleriot:bs) \
locale(aisleriot:ca) \
locale(aisleriot:ca@valencia) \
locale(aisleriot:cs) \
locale(aisleriot:cy) \
locale(aisleriot:da) \
locale(aisleriot:de) \
locale(aisleriot:dz) \
locale(aisleriot:el) \
locale(aisleriot:en@shaw) \
locale(aisleriot:en_CA) \
locale(aisleriot:en_GB) \
locale(aisleriot:eo) \
locale(aisleriot:es) \
locale(aisleriot:et) \
locale(aisleriot:eu) \
locale(aisleriot:fa) \
locale(aisleriot:fi) \
locale(aisleriot:fr) \
locale(aisleriot:fur) \
locale(aisleriot:ga) \
locale(aisleriot:gl) \
locale(aisleriot:gu) \
locale(aisleriot:he) \
locale(aisleriot:hi) \
locale(aisleriot:hr) \
locale(aisleriot:hu) \
locale(aisleriot:id) \
locale(aisleriot:is) \
locale(aisleriot:it) \
locale(aisleriot:ja) \
locale(aisleriot:ka) \
locale(aisleriot:kk) \
locale(aisleriot:km) \
locale(aisleriot:kn) \
locale(aisleriot:ko) \
locale(aisleriot:lt) \
locale(aisleriot:lv) \
locale(aisleriot:mai) \
locale(aisleriot:mk) \
locale(aisleriot:ml) \
locale(aisleriot:mr) \
locale(aisleriot:ms) \
locale(aisleriot:nb) \
locale(aisleriot:ne) \
locale(aisleriot:nl) \
locale(aisleriot:nn) \
locale(aisleriot:oc) \
locale(aisleriot:or) \
locale(aisleriot:pa) \
locale(aisleriot:pl) \
locale(aisleriot:pt) \
locale(aisleriot:pt_BR) \
locale(aisleriot:ro) \
locale(aisleriot:ru) \
locale(aisleriot:si) \
locale(aisleriot:sk) \
locale(aisleriot:sl) \
locale(aisleriot:sq) \
locale(aisleriot:sr) \
locale(aisleriot:sr@latin) \
locale(aisleriot:sv) \
locale(aisleriot:ta) \
locale(aisleriot:te) \
locale(aisleriot:th) \
locale(aisleriot:tr) \
locale(aisleriot:ug) \
locale(aisleriot:uk) \
locale(aisleriot:vi) \
locale(aisleriot:wa) \
locale(aisleriot:zh_CN) \
locale(aisleriot:zh_HK) \
locale(aisleriot:zh_TW)"

RDEPENDS:${PN} += "aisleriot"

inherit rpm
