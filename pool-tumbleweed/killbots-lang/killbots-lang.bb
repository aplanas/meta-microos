SUMMARY = "Translations for package killbots"
DESCRIPTION = "Provides translations for the 'killbots' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "killbots-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "985ad7f73dca66331d4f20ae67445bfe672ac1a19e25504f7bf0c80b9e2a97a80dc9fd29f0b813685bb505c0c71f14726ff7b048703cd87184580a152cc537ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "killbots-lang \
killbots-lang-all \
locale(killbots:ar) \
locale(killbots:bg) \
locale(killbots:bs) \
locale(killbots:ca) \
locale(killbots:ca@valencia) \
locale(killbots:cs) \
locale(killbots:da) \
locale(killbots:de) \
locale(killbots:el) \
locale(killbots:en_GB) \
locale(killbots:eo) \
locale(killbots:es) \
locale(killbots:et) \
locale(killbots:eu) \
locale(killbots:fi) \
locale(killbots:fr) \
locale(killbots:ga) \
locale(killbots:gl) \
locale(killbots:hr) \
locale(killbots:hu) \
locale(killbots:id) \
locale(killbots:is) \
locale(killbots:it) \
locale(killbots:ja) \
locale(killbots:ka) \
locale(killbots:kk) \
locale(killbots:km) \
locale(killbots:ko) \
locale(killbots:lt) \
locale(killbots:lv) \
locale(killbots:mai) \
locale(killbots:ml) \
locale(killbots:mr) \
locale(killbots:nb) \
locale(killbots:nds) \
locale(killbots:nl) \
locale(killbots:nn) \
locale(killbots:pl) \
locale(killbots:pt) \
locale(killbots:pt_BR) \
locale(killbots:ro) \
locale(killbots:ru) \
locale(killbots:sk) \
locale(killbots:sl) \
locale(killbots:sr) \
locale(killbots:sr@ijekavian) \
locale(killbots:sr@ijekavianlatin) \
locale(killbots:sr@latin) \
locale(killbots:sv) \
locale(killbots:tr) \
locale(killbots:ug) \
locale(killbots:uk) \
locale(killbots:zh_CN) \
locale(killbots:zh_TW)"
RDEPENDS:${PN} += "killbots"

inherit rpm