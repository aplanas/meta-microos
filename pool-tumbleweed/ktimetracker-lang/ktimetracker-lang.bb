SUMMARY = "Translations for package ktimetracker"
DESCRIPTION = "Provides translations for the 'ktimetracker' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.1"

RPM_NAME = "ktimetracker-lang-5.0.1-1.18.noarch.rpm"
RPM_HASH = "ab7a3951addccad9f451f418ac857637a914c58fbed696e1af209b01f5c1a32ec6dbc22899d7f9f5229cbda949e08d6fdd76c9d568c1d491207f28f8f03f3956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktimetracker-lang \
ktimetracker-lang-all \
locale(ktimetracker:af) \
locale(ktimetracker:ar) \
locale(ktimetracker:be) \
locale(ktimetracker:bg) \
locale(ktimetracker:br) \
locale(ktimetracker:bs) \
locale(ktimetracker:ca) \
locale(ktimetracker:ca@valencia) \
locale(ktimetracker:cs) \
locale(ktimetracker:cy) \
locale(ktimetracker:da) \
locale(ktimetracker:de) \
locale(ktimetracker:el) \
locale(ktimetracker:en_GB) \
locale(ktimetracker:eo) \
locale(ktimetracker:es) \
locale(ktimetracker:et) \
locale(ktimetracker:eu) \
locale(ktimetracker:fa) \
locale(ktimetracker:fi) \
locale(ktimetracker:fr) \
locale(ktimetracker:ga) \
locale(ktimetracker:gl) \
locale(ktimetracker:he) \
locale(ktimetracker:hr) \
locale(ktimetracker:hu) \
locale(ktimetracker:ia) \
locale(ktimetracker:is) \
locale(ktimetracker:it) \
locale(ktimetracker:ja) \
locale(ktimetracker:kk) \
locale(ktimetracker:km) \
locale(ktimetracker:ko) \
locale(ktimetracker:lt) \
locale(ktimetracker:lv) \
locale(ktimetracker:mai) \
locale(ktimetracker:mk) \
locale(ktimetracker:mr) \
locale(ktimetracker:ms) \
locale(ktimetracker:nb) \
locale(ktimetracker:nds) \
locale(ktimetracker:ne) \
locale(ktimetracker:nl) \
locale(ktimetracker:nn) \
locale(ktimetracker:pa) \
locale(ktimetracker:pl) \
locale(ktimetracker:pt) \
locale(ktimetracker:pt_BR) \
locale(ktimetracker:ro) \
locale(ktimetracker:ru) \
locale(ktimetracker:sk) \
locale(ktimetracker:sl) \
locale(ktimetracker:sv) \
locale(ktimetracker:ta) \
locale(ktimetracker:th) \
locale(ktimetracker:tr) \
locale(ktimetracker:ug) \
locale(ktimetracker:uk) \
locale(ktimetracker:zh_CN) \
locale(ktimetracker:zh_TW)"

RDEPENDS:${PN} += "ktimetracker"

inherit rpm
