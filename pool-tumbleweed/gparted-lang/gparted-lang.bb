SUMMARY = "Translations for package gparted"
DESCRIPTION = "Provides translations for the 'gparted' package."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "gparted-lang-1.5.0-1.3.noarch.rpm"
RPM_HASH = "21dc9c30f785301d9bc6002f155ad24dca0e7f19cd5a80dd885b67dc278ceb0655d8db784ed3ba16015e94c98fbdc34a2ef799525c1b910393303f387efb8ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gparted-lang \
gparted-lang-all \
locale(gparted:ar) \
locale(gparted:be) \
locale(gparted:bg) \
locale(gparted:br) \
locale(gparted:bs) \
locale(gparted:ca) \
locale(gparted:ca@valencia) \
locale(gparted:cs) \
locale(gparted:da) \
locale(gparted:de) \
locale(gparted:dz) \
locale(gparted:el) \
locale(gparted:en_CA) \
locale(gparted:en_GB) \
locale(gparted:eo) \
locale(gparted:es) \
locale(gparted:et) \
locale(gparted:eu) \
locale(gparted:fa) \
locale(gparted:fi) \
locale(gparted:fr) \
locale(gparted:fur) \
locale(gparted:gd) \
locale(gparted:gl) \
locale(gparted:gu) \
locale(gparted:he) \
locale(gparted:hr) \
locale(gparted:hu) \
locale(gparted:id) \
locale(gparted:is) \
locale(gparted:it) \
locale(gparted:ja) \
locale(gparted:ka) \
locale(gparted:kk) \
locale(gparted:ko) \
locale(gparted:lt) \
locale(gparted:lv) \
locale(gparted:mk) \
locale(gparted:ml) \
locale(gparted:nb) \
locale(gparted:ne) \
locale(gparted:nl) \
locale(gparted:nn) \
locale(gparted:oc) \
locale(gparted:pa) \
locale(gparted:pl) \
locale(gparted:pt) \
locale(gparted:pt_BR) \
locale(gparted:ro) \
locale(gparted:ru) \
locale(gparted:si) \
locale(gparted:sk) \
locale(gparted:sl) \
locale(gparted:sr) \
locale(gparted:sr@latin) \
locale(gparted:sv) \
locale(gparted:te) \
locale(gparted:th) \
locale(gparted:tr) \
locale(gparted:uk) \
locale(gparted:vi) \
locale(gparted:zh_CN) \
locale(gparted:zh_HK) \
locale(gparted:zh_TW)"

RDEPENDS:${PN} += "gparted"

inherit rpm
