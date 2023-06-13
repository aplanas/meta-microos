SUMMARY = "Translations for package oxygen5"
DESCRIPTION = "Provides translations for the 'oxygen5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "oxygen5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "32e9f0ca5aec8e9d2d57c9832d18d8356803d9e368dbc044eea8969200cac2bfef27fe5d100f6bb5bef149067281df3b64b0b961aa9176fcb780c8736e10bbc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(oxygen5:af) \
locale(oxygen5:ar) \
locale(oxygen5:az) \
locale(oxygen5:be) \
locale(oxygen5:be@latin) \
locale(oxygen5:bg) \
locale(oxygen5:bn_IN) \
locale(oxygen5:br) \
locale(oxygen5:bs) \
locale(oxygen5:ca) \
locale(oxygen5:ca@valencia) \
locale(oxygen5:cs) \
locale(oxygen5:cy) \
locale(oxygen5:da) \
locale(oxygen5:de) \
locale(oxygen5:el) \
locale(oxygen5:en_GB) \
locale(oxygen5:eo) \
locale(oxygen5:es) \
locale(oxygen5:et) \
locale(oxygen5:eu) \
locale(oxygen5:fa) \
locale(oxygen5:fi) \
locale(oxygen5:fr) \
locale(oxygen5:ga) \
locale(oxygen5:gl) \
locale(oxygen5:gu) \
locale(oxygen5:he) \
locale(oxygen5:hi) \
locale(oxygen5:hr) \
locale(oxygen5:hu) \
locale(oxygen5:ia) \
locale(oxygen5:id) \
locale(oxygen5:is) \
locale(oxygen5:it) \
locale(oxygen5:ja) \
locale(oxygen5:ka) \
locale(oxygen5:kk) \
locale(oxygen5:km) \
locale(oxygen5:kn) \
locale(oxygen5:ko) \
locale(oxygen5:lt) \
locale(oxygen5:lv) \
locale(oxygen5:mai) \
locale(oxygen5:mk) \
locale(oxygen5:ml) \
locale(oxygen5:mr) \
locale(oxygen5:ms) \
locale(oxygen5:nb) \
locale(oxygen5:nds) \
locale(oxygen5:ne) \
locale(oxygen5:nl) \
locale(oxygen5:nn) \
locale(oxygen5:or) \
locale(oxygen5:pa) \
locale(oxygen5:pl) \
locale(oxygen5:pt) \
locale(oxygen5:pt_BR) \
locale(oxygen5:ro) \
locale(oxygen5:ru) \
locale(oxygen5:si) \
locale(oxygen5:sk) \
locale(oxygen5:sl) \
locale(oxygen5:sq) \
locale(oxygen5:sr) \
locale(oxygen5:sr@ijekavian) \
locale(oxygen5:sr@ijekavianlatin) \
locale(oxygen5:sr@latin) \
locale(oxygen5:sv) \
locale(oxygen5:ta) \
locale(oxygen5:te) \
locale(oxygen5:th) \
locale(oxygen5:tr) \
locale(oxygen5:ug) \
locale(oxygen5:uk) \
locale(oxygen5:vi) \
locale(oxygen5:wa) \
locale(oxygen5:zh_CN) \
locale(oxygen5:zh_TW) \
oxygen5-lang \
oxygen5-lang-all"

RDEPENDS:${PN} += "oxygen5"

inherit rpm
