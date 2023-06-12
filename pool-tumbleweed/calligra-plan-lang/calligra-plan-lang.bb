SUMMARY = "Translations for package calligra-plan"
DESCRIPTION = "Provides translations for the 'calligra-plan' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.0"

RPM_NAME = "calligra-plan-lang-3.3.0-2.9.noarch.rpm"
RPM_HASH = "ba8078df5192548c89ee8af167f34966db4bdc2b41568ef11f7bc51f70c55916f8a01056402a80edf6ca247228d41965bb4a71541e6f3204d731987e23328360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calligra-plan-lang \
calligra-plan-lang-all \
locale(calligra-plan:ar) \
locale(calligra-plan:ast) \
locale(calligra-plan:be) \
locale(calligra-plan:bg) \
locale(calligra-plan:br) \
locale(calligra-plan:bs) \
locale(calligra-plan:ca) \
locale(calligra-plan:ca@valencia) \
locale(calligra-plan:cs) \
locale(calligra-plan:da) \
locale(calligra-plan:de) \
locale(calligra-plan:el) \
locale(calligra-plan:en_GB) \
locale(calligra-plan:eo) \
locale(calligra-plan:es) \
locale(calligra-plan:et) \
locale(calligra-plan:eu) \
locale(calligra-plan:fa) \
locale(calligra-plan:fi) \
locale(calligra-plan:fr) \
locale(calligra-plan:ga) \
locale(calligra-plan:gl) \
locale(calligra-plan:hi) \
locale(calligra-plan:hu) \
locale(calligra-plan:ia) \
locale(calligra-plan:id) \
locale(calligra-plan:it) \
locale(calligra-plan:ja) \
locale(calligra-plan:kk) \
locale(calligra-plan:km) \
locale(calligra-plan:ko) \
locale(calligra-plan:lt) \
locale(calligra-plan:lv) \
locale(calligra-plan:mai) \
locale(calligra-plan:mr) \
locale(calligra-plan:nb) \
locale(calligra-plan:nds) \
locale(calligra-plan:ne) \
locale(calligra-plan:nl) \
locale(calligra-plan:nn) \
locale(calligra-plan:oc) \
locale(calligra-plan:pl) \
locale(calligra-plan:pt) \
locale(calligra-plan:pt_BR) \
locale(calligra-plan:ro) \
locale(calligra-plan:ru) \
locale(calligra-plan:sk) \
locale(calligra-plan:sl) \
locale(calligra-plan:sv) \
locale(calligra-plan:th) \
locale(calligra-plan:tr) \
locale(calligra-plan:ug) \
locale(calligra-plan:uk) \
locale(calligra-plan:wa) \
locale(calligra-plan:zh_CN) \
locale(calligra-plan:zh_TW)"
RDEPENDS:${PN} += "calligra-plan"

inherit rpm
