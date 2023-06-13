SUMMARY = "Translations for package plasma5-addons"
DESCRIPTION = "Provides translations for the 'plasma5-addons' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-addons-lang-5.27.5-1.2.noarch.rpm"
RPM_HASH = "be557aa38e456550902edf961aafece9fe491ef47f5337eba87c8f08af7f4e4c2e0afe59eebc1143e354987a6c67103e3a45e0fe4ce83f082253dda1e6d703eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-addons:ar) \
locale(plasma5-addons:ast) \
locale(plasma5-addons:az) \
locale(plasma5-addons:be) \
locale(plasma5-addons:bg) \
locale(plasma5-addons:bs) \
locale(plasma5-addons:ca) \
locale(plasma5-addons:ca@valencia) \
locale(plasma5-addons:cs) \
locale(plasma5-addons:da) \
locale(plasma5-addons:de) \
locale(plasma5-addons:el) \
locale(plasma5-addons:en_GB) \
locale(plasma5-addons:eo) \
locale(plasma5-addons:es) \
locale(plasma5-addons:et) \
locale(plasma5-addons:eu) \
locale(plasma5-addons:fi) \
locale(plasma5-addons:fr) \
locale(plasma5-addons:ga) \
locale(plasma5-addons:gl) \
locale(plasma5-addons:he) \
locale(plasma5-addons:hi) \
locale(plasma5-addons:hr) \
locale(plasma5-addons:hu) \
locale(plasma5-addons:ia) \
locale(plasma5-addons:id) \
locale(plasma5-addons:is) \
locale(plasma5-addons:it) \
locale(plasma5-addons:ja) \
locale(plasma5-addons:ka) \
locale(plasma5-addons:kk) \
locale(plasma5-addons:km) \
locale(plasma5-addons:ko) \
locale(plasma5-addons:lt) \
locale(plasma5-addons:lv) \
locale(plasma5-addons:ml) \
locale(plasma5-addons:mr) \
locale(plasma5-addons:ms) \
locale(plasma5-addons:nb) \
locale(plasma5-addons:nds) \
locale(plasma5-addons:nl) \
locale(plasma5-addons:nn) \
locale(plasma5-addons:pa) \
locale(plasma5-addons:pl) \
locale(plasma5-addons:pt) \
locale(plasma5-addons:pt_BR) \
locale(plasma5-addons:ro) \
locale(plasma5-addons:ru) \
locale(plasma5-addons:sk) \
locale(plasma5-addons:sl) \
locale(plasma5-addons:sq) \
locale(plasma5-addons:sr) \
locale(plasma5-addons:sr@ijekavian) \
locale(plasma5-addons:sr@ijekavianlatin) \
locale(plasma5-addons:sr@latin) \
locale(plasma5-addons:sv) \
locale(plasma5-addons:ta) \
locale(plasma5-addons:th) \
locale(plasma5-addons:tr) \
locale(plasma5-addons:ug) \
locale(plasma5-addons:uk) \
locale(plasma5-addons:vi) \
locale(plasma5-addons:wa) \
locale(plasma5-addons:zh_CN) \
locale(plasma5-addons:zh_TW) \
plasma5-addons-lang \
plasma5-addons-lang-all"

RDEPENDS:${PN} += "plasma5-addons"

inherit rpm
