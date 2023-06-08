SUMMARY = "Translations for package dragonplayer"
DESCRIPTION = "Provides translations for the 'dragonplayer' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "dragonplayer-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "88e82a44e020d4aa0a204916b14aab68e406d2af581af4529f021024e3c9c140d6b50c80def87b748b437938175e9c0431a658e40512e7604160509d326c2816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dragonplayer-lang dragonplayer-lang-all locale(dragonplayer:ar) locale(dragonplayer:be) locale(dragonplayer:bg) locale(dragonplayer:bs) locale(dragonplayer:ca) locale(dragonplayer:ca@valencia) locale(dragonplayer:cs) locale(dragonplayer:da) locale(dragonplayer:de) locale(dragonplayer:el) locale(dragonplayer:en_GB) locale(dragonplayer:eo) locale(dragonplayer:es) locale(dragonplayer:et) locale(dragonplayer:eu) locale(dragonplayer:fi) locale(dragonplayer:fr) locale(dragonplayer:ga) locale(dragonplayer:gl) locale(dragonplayer:he) locale(dragonplayer:hr) locale(dragonplayer:hu) locale(dragonplayer:ia) locale(dragonplayer:id) locale(dragonplayer:is) locale(dragonplayer:it) locale(dragonplayer:ja) locale(dragonplayer:ka) locale(dragonplayer:kk) locale(dragonplayer:km) locale(dragonplayer:ko) locale(dragonplayer:lt) locale(dragonplayer:lv) locale(dragonplayer:mr) locale(dragonplayer:nb) locale(dragonplayer:nds) locale(dragonplayer:nl) locale(dragonplayer:nn) locale(dragonplayer:oc) locale(dragonplayer:pa) locale(dragonplayer:pl) locale(dragonplayer:pt) locale(dragonplayer:pt_BR) locale(dragonplayer:ro) locale(dragonplayer:ru) locale(dragonplayer:sk) locale(dragonplayer:sl) locale(dragonplayer:sq) locale(dragonplayer:sr) locale(dragonplayer:sr@ijekavian) locale(dragonplayer:sr@ijekavianlatin) locale(dragonplayer:sr@latin) locale(dragonplayer:sv) locale(dragonplayer:th) locale(dragonplayer:tr) locale(dragonplayer:ug) locale(dragonplayer:uk) locale(dragonplayer:wa) locale(dragonplayer:zh_CN) locale(dragonplayer:zh_TW)"
RDEPENDS:${PN} += "dragonplayer"

inherit rpm
