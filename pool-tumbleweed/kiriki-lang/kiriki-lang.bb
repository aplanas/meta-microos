SUMMARY = "Translations for package kiriki"
DESCRIPTION = "Provides translations for the 'kiriki' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kiriki-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "0fef5a60b68ceaabeafacdbdee2e0852a3034b02b0d2fc99240f097b5c9ffc88aec979877fb045aa756c591b523ab096bf9e22cee44aeb1fda7491949a175052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiriki-lang \
kiriki-lang-all \
locale(kiriki:ar) \
locale(kiriki:be) \
locale(kiriki:bg) \
locale(kiriki:bs) \
locale(kiriki:ca) \
locale(kiriki:ca@valencia) \
locale(kiriki:cs) \
locale(kiriki:da) \
locale(kiriki:de) \
locale(kiriki:el) \
locale(kiriki:en_GB) \
locale(kiriki:eo) \
locale(kiriki:es) \
locale(kiriki:et) \
locale(kiriki:eu) \
locale(kiriki:fi) \
locale(kiriki:fr) \
locale(kiriki:ga) \
locale(kiriki:gl) \
locale(kiriki:hi) \
locale(kiriki:hr) \
locale(kiriki:hu) \
locale(kiriki:id) \
locale(kiriki:is) \
locale(kiriki:it) \
locale(kiriki:ja) \
locale(kiriki:ka) \
locale(kiriki:kk) \
locale(kiriki:km) \
locale(kiriki:ko) \
locale(kiriki:lt) \
locale(kiriki:lv) \
locale(kiriki:mai) \
locale(kiriki:ml) \
locale(kiriki:mr) \
locale(kiriki:nb) \
locale(kiriki:nds) \
locale(kiriki:nl) \
locale(kiriki:nn) \
locale(kiriki:oc) \
locale(kiriki:pl) \
locale(kiriki:pt) \
locale(kiriki:pt_BR) \
locale(kiriki:ro) \
locale(kiriki:ru) \
locale(kiriki:sk) \
locale(kiriki:sl) \
locale(kiriki:sr) \
locale(kiriki:sr@ijekavian) \
locale(kiriki:sr@ijekavianlatin) \
locale(kiriki:sr@latin) \
locale(kiriki:sv) \
locale(kiriki:tr) \
locale(kiriki:ug) \
locale(kiriki:uk) \
locale(kiriki:zh_CN) \
locale(kiriki:zh_TW)"
RDEPENDS:${PN} += "kiriki"

inherit rpm