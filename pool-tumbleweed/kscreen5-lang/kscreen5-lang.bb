SUMMARY = "Translations for package kscreen5"
DESCRIPTION = "Provides translations for the 'kscreen5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kscreen5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "c6ca3e36f6c1f4f762e2fc6146fdeaa7ee97da6288ef671a43473d34f224eb7af311fa499276afcd7c1222c8665deac4f7792a5a5b69dec5c87fd52798aca3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kscreen5-lang \
kscreen5-lang-all \
locale(kscreen5:ar) \
locale(kscreen5:az) \
locale(kscreen5:bg) \
locale(kscreen5:bs) \
locale(kscreen5:ca) \
locale(kscreen5:ca@valencia) \
locale(kscreen5:cs) \
locale(kscreen5:da) \
locale(kscreen5:de) \
locale(kscreen5:el) \
locale(kscreen5:en_GB) \
locale(kscreen5:es) \
locale(kscreen5:et) \
locale(kscreen5:eu) \
locale(kscreen5:fi) \
locale(kscreen5:fr) \
locale(kscreen5:gl) \
locale(kscreen5:he) \
locale(kscreen5:hu) \
locale(kscreen5:ia) \
locale(kscreen5:id) \
locale(kscreen5:it) \
locale(kscreen5:ja) \
locale(kscreen5:ka) \
locale(kscreen5:ko) \
locale(kscreen5:lt) \
locale(kscreen5:lv) \
locale(kscreen5:ml) \
locale(kscreen5:nb) \
locale(kscreen5:nl) \
locale(kscreen5:nn) \
locale(kscreen5:pa) \
locale(kscreen5:pl) \
locale(kscreen5:pt) \
locale(kscreen5:pt_BR) \
locale(kscreen5:ro) \
locale(kscreen5:ru) \
locale(kscreen5:sk) \
locale(kscreen5:sl) \
locale(kscreen5:sr) \
locale(kscreen5:sr@ijekavian) \
locale(kscreen5:sr@ijekavianlatin) \
locale(kscreen5:sr@latin) \
locale(kscreen5:sv) \
locale(kscreen5:ta) \
locale(kscreen5:tr) \
locale(kscreen5:uk) \
locale(kscreen5:zh_CN) \
locale(kscreen5:zh_TW)"
RDEPENDS:${PN} += "kscreen5"

inherit rpm
