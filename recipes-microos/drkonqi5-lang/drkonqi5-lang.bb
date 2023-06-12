SUMMARY = "Translations for package drkonqi5"
DESCRIPTION = "Provides translations for the 'drkonqi5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "drkonqi5-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "b27e535494d04176b3b79bc974da7cfb526f79464c28f4e3005a449cf6a7d0fddf3901e8a3e2b9f825fac80cde0f2128eddf45551d8d1f11a82d68e4defc8624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "drkonqi5-lang drkonqi5-lang-all locale(drkonqi5:af) locale(drkonqi5:ar) locale(drkonqi5:az) locale(drkonqi5:be) locale(drkonqi5:bg) locale(drkonqi5:bn) locale(drkonqi5:bn_IN) locale(drkonqi5:br) locale(drkonqi5:bs) locale(drkonqi5:ca) locale(drkonqi5:ca@valencia) locale(drkonqi5:cs) locale(drkonqi5:cy) locale(drkonqi5:da) locale(drkonqi5:de) locale(drkonqi5:el) locale(drkonqi5:en_GB) locale(drkonqi5:eo) locale(drkonqi5:es) locale(drkonqi5:et) locale(drkonqi5:eu) locale(drkonqi5:fa) locale(drkonqi5:fi) locale(drkonqi5:fr) locale(drkonqi5:ga) locale(drkonqi5:gl) locale(drkonqi5:gu) locale(drkonqi5:he) locale(drkonqi5:hi) locale(drkonqi5:hr) locale(drkonqi5:hu) locale(drkonqi5:ia) locale(drkonqi5:id) locale(drkonqi5:is) locale(drkonqi5:it) locale(drkonqi5:ja) locale(drkonqi5:ka) locale(drkonqi5:kk) locale(drkonqi5:km) locale(drkonqi5:kn) locale(drkonqi5:ko) locale(drkonqi5:lt) locale(drkonqi5:lv) locale(drkonqi5:mai) locale(drkonqi5:mk) locale(drkonqi5:ml) locale(drkonqi5:mr) locale(drkonqi5:ms) locale(drkonqi5:nb) locale(drkonqi5:nds) locale(drkonqi5:ne) locale(drkonqi5:nl) locale(drkonqi5:nn) locale(drkonqi5:oc) locale(drkonqi5:or) locale(drkonqi5:pa) locale(drkonqi5:pl) locale(drkonqi5:pt) locale(drkonqi5:pt_BR) locale(drkonqi5:ro) locale(drkonqi5:ru) locale(drkonqi5:si) locale(drkonqi5:sk) locale(drkonqi5:sl) locale(drkonqi5:sq) locale(drkonqi5:sr) locale(drkonqi5:sr@ijekavian) locale(drkonqi5:sr@ijekavianlatin) locale(drkonqi5:sr@latin) locale(drkonqi5:sv) locale(drkonqi5:ta) locale(drkonqi5:te) locale(drkonqi5:th) locale(drkonqi5:tr) locale(drkonqi5:ug) locale(drkonqi5:uk) locale(drkonqi5:vi) locale(drkonqi5:wa) locale(drkonqi5:zh_CN) locale(drkonqi5:zh_TW)"
RDEPENDS:${PN} += "drkonqi5"

inherit rpm
