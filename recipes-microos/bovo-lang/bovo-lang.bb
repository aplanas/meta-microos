SUMMARY = "Translations for package bovo"
DESCRIPTION = "Provides translations for the 'bovo' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "bovo-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "bdb83a05c00a0676be9dd8279dbad4ef3124e835815c9e729a65ab582e788a26c52aaea177de91d78449fff4115099b31ef748b82fc780ad43c072010fb6e30f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bovo-lang bovo-lang-all locale(bovo:ar) locale(bovo:be) locale(bovo:bg) locale(bovo:bs) locale(bovo:ca) locale(bovo:ca@valencia) locale(bovo:cs) locale(bovo:da) locale(bovo:de) locale(bovo:el) locale(bovo:en_GB) locale(bovo:eo) locale(bovo:es) locale(bovo:et) locale(bovo:eu) locale(bovo:fi) locale(bovo:fr) locale(bovo:ga) locale(bovo:gl) locale(bovo:hi) locale(bovo:hr) locale(bovo:hu) locale(bovo:id) locale(bovo:is) locale(bovo:it) locale(bovo:ja) locale(bovo:ka) locale(bovo:kk) locale(bovo:km) locale(bovo:ko) locale(bovo:lt) locale(bovo:lv) locale(bovo:mai) locale(bovo:ml) locale(bovo:mr) locale(bovo:nb) locale(bovo:nds) locale(bovo:nl) locale(bovo:nn) locale(bovo:oc) locale(bovo:pa) locale(bovo:pl) locale(bovo:pt) locale(bovo:pt_BR) locale(bovo:ro) locale(bovo:ru) locale(bovo:sk) locale(bovo:sl) locale(bovo:sq) locale(bovo:sr) locale(bovo:sr@ijekavian) locale(bovo:sr@ijekavianlatin) locale(bovo:sr@latin) locale(bovo:sv) locale(bovo:tr) locale(bovo:ug) locale(bovo:uk) locale(bovo:zh_CN) locale(bovo:zh_TW)"
RDEPENDS:${PN} += "bovo"

inherit rpm
