SUMMARY = "Translations for package amarok"
DESCRIPTION = "Provides translations for the 'amarok' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.75git.20230408T114133~7098c192a6"

RPM_NAME = "amarok-lang-2.9.75git.20230408T114133~7098c192a6-1.2.noarch.rpm"
RPM_HASH = "b45fd172c654830077a460ee553c9150c6ff5237a43876bf37e583efce632c9d06479ee19dae1054f7532dc4b583a3317e51780cdcca052726fe38009ec36d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amarok-lang \
amarok-lang-all \
locale(amarok:af) \
locale(amarok:ar) \
locale(amarok:be) \
locale(amarok:bg) \
locale(amarok:bs) \
locale(amarok:ca) \
locale(amarok:ca@valencia) \
locale(amarok:cs) \
locale(amarok:da) \
locale(amarok:de) \
locale(amarok:el) \
locale(amarok:en_GB) \
locale(amarok:eo) \
locale(amarok:es) \
locale(amarok:et) \
locale(amarok:eu) \
locale(amarok:fa) \
locale(amarok:fi) \
locale(amarok:fr) \
locale(amarok:ga) \
locale(amarok:gl) \
locale(amarok:he) \
locale(amarok:hr) \
locale(amarok:hu) \
locale(amarok:ia) \
locale(amarok:id) \
locale(amarok:is) \
locale(amarok:it) \
locale(amarok:ja) \
locale(amarok:ka) \
locale(amarok:km) \
locale(amarok:ko) \
locale(amarok:lt) \
locale(amarok:lv) \
locale(amarok:mai) \
locale(amarok:ml) \
locale(amarok:mr) \
locale(amarok:ms) \
locale(amarok:nb) \
locale(amarok:nds) \
locale(amarok:ne) \
locale(amarok:nl) \
locale(amarok:nn) \
locale(amarok:oc) \
locale(amarok:pa) \
locale(amarok:pl) \
locale(amarok:pt) \
locale(amarok:pt_BR) \
locale(amarok:ro) \
locale(amarok:ru) \
locale(amarok:si) \
locale(amarok:sk) \
locale(amarok:sl) \
locale(amarok:sq) \
locale(amarok:sr) \
locale(amarok:sr@ijekavian) \
locale(amarok:sr@ijekavianlatin) \
locale(amarok:sr@latin) \
locale(amarok:sv) \
locale(amarok:th) \
locale(amarok:tr) \
locale(amarok:ug) \
locale(amarok:uk) \
locale(amarok:wa) \
locale(amarok:zh_CN) \
locale(amarok:zh_TW)"

RDEPENDS:${PN} += "amarok"

inherit rpm
