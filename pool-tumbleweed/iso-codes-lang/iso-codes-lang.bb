SUMMARY = "Translations for package iso-codes"
DESCRIPTION = "Provides translations for the 'iso-codes' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.15.0"

RPM_NAME = "iso-codes-lang-4.15.0-1.1.noarch.rpm"
RPM_HASH = "04f2310ad7be7592b43aaa2a99a53a969b628558992fd4bc84779fd62fa231e5dd25ed3261e3702fedba8d6f5ae008ba56a284e2ae5afbf3cab8625e4f7a48f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes-lang \
iso-codes-lang-all \
locale(iso-codes:af) \
locale(iso-codes:ar) \
locale(iso-codes:as) \
locale(iso-codes:ast) \
locale(iso-codes:az) \
locale(iso-codes:be) \
locale(iso-codes:bg) \
locale(iso-codes:bn) \
locale(iso-codes:bn_IN) \
locale(iso-codes:br) \
locale(iso-codes:bs) \
locale(iso-codes:ca) \
locale(iso-codes:cs) \
locale(iso-codes:cy) \
locale(iso-codes:da) \
locale(iso-codes:de) \
locale(iso-codes:dz) \
locale(iso-codes:el) \
locale(iso-codes:en) \
locale(iso-codes:eo) \
locale(iso-codes:es) \
locale(iso-codes:et) \
locale(iso-codes:eu) \
locale(iso-codes:fa) \
locale(iso-codes:fi) \
locale(iso-codes:fr) \
locale(iso-codes:fur) \
locale(iso-codes:ga) \
locale(iso-codes:gl) \
locale(iso-codes:gu) \
locale(iso-codes:he) \
locale(iso-codes:hi) \
locale(iso-codes:hr) \
locale(iso-codes:hu) \
locale(iso-codes:ia) \
locale(iso-codes:id) \
locale(iso-codes:is) \
locale(iso-codes:it) \
locale(iso-codes:ja) \
locale(iso-codes:ka) \
locale(iso-codes:kk) \
locale(iso-codes:km) \
locale(iso-codes:kn) \
locale(iso-codes:ko) \
locale(iso-codes:lt) \
locale(iso-codes:lv) \
locale(iso-codes:mai) \
locale(iso-codes:mk) \
locale(iso-codes:ml) \
locale(iso-codes:mr) \
locale(iso-codes:ms) \
locale(iso-codes:nb) \
locale(iso-codes:nb_NO) \
locale(iso-codes:ne) \
locale(iso-codes:nl) \
locale(iso-codes:nn) \
locale(iso-codes:oc) \
locale(iso-codes:or) \
locale(iso-codes:pa) \
locale(iso-codes:pl) \
locale(iso-codes:pt) \
locale(iso-codes:pt_BR) \
locale(iso-codes:ro) \
locale(iso-codes:ru) \
locale(iso-codes:si) \
locale(iso-codes:sk) \
locale(iso-codes:sl) \
locale(iso-codes:sq) \
locale(iso-codes:sr) \
locale(iso-codes:sr@latin) \
locale(iso-codes:sv) \
locale(iso-codes:ta) \
locale(iso-codes:te) \
locale(iso-codes:th) \
locale(iso-codes:tr) \
locale(iso-codes:ug) \
locale(iso-codes:uk) \
locale(iso-codes:vi) \
locale(iso-codes:wa) \
locale(iso-codes:zh_CN) \
locale(iso-codes:zh_HK) \
locale(iso-codes:zh_Hans) \
locale(iso-codes:zh_Hant) \
locale(iso-codes:zh_TW)"
RDEPENDS:${PN} += "iso-codes"

inherit rpm
