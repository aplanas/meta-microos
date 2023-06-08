SUMMARY = "Translations for package ark"
DESCRIPTION = "Provides translations for the 'ark' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ark-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "ef95ef0ddaf493922c5daf9fadaf7503a7e99ed0d8d5f88110273b745ee55369a24c36906226604002e65906db60029e92655661fe632584107d1cef6564f53c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ark-lang ark-lang-all locale(ark:af) locale(ark:ar) locale(ark:ast) locale(ark:az) locale(ark:be) locale(ark:bg) locale(ark:br) locale(ark:bs) locale(ark:ca) locale(ark:ca@valencia) locale(ark:cs) locale(ark:cy) locale(ark:da) locale(ark:de) locale(ark:el) locale(ark:en_GB) locale(ark:eo) locale(ark:es) locale(ark:et) locale(ark:eu) locale(ark:fa) locale(ark:fi) locale(ark:fr) locale(ark:ga) locale(ark:gl) locale(ark:he) locale(ark:hi) locale(ark:hr) locale(ark:hu) locale(ark:ia) locale(ark:id) locale(ark:is) locale(ark:it) locale(ark:ja) locale(ark:ka) locale(ark:kk) locale(ark:km) locale(ark:ko) locale(ark:lt) locale(ark:lv) locale(ark:mk) locale(ark:mr) locale(ark:ms) locale(ark:nb) locale(ark:nds) locale(ark:ne) locale(ark:nl) locale(ark:nn) locale(ark:oc) locale(ark:pa) locale(ark:pl) locale(ark:pt) locale(ark:pt_BR) locale(ark:ro) locale(ark:ru) locale(ark:sk) locale(ark:sl) locale(ark:sq) locale(ark:sr) locale(ark:sr@ijekavian) locale(ark:sr@ijekavianlatin) locale(ark:sr@latin) locale(ark:sv) locale(ark:ta) locale(ark:th) locale(ark:tr) locale(ark:ug) locale(ark:uk) locale(ark:zh_CN) locale(ark:zh_HK) locale(ark:zh_TW)"
RDEPENDS:${PN} += "ark"

inherit rpm
