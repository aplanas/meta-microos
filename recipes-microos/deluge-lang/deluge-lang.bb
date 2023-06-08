SUMMARY = "Translations for package deluge"
DESCRIPTION = "Provides translations for the 'deluge' package."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "2.1.1"

RPM_NAME = "deluge-lang-2.1.1-3.3.noarch.rpm"
RPM_HASH = "7a78934af66578e7b9024775cb043b07cbec10ff5ab86dd0143bdc0e1903ccf8b638dbec189df1eedf7b87e7b37de18029f495b1dd59e9c329c52357318f6e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deluge-lang deluge-lang-all locale(deluge:af) locale(deluge:ar) locale(deluge:ast) locale(deluge:be) locale(deluge:bg) locale(deluge:bn) locale(deluge:bs) locale(deluge:ca) locale(deluge:cs) locale(deluge:cy) locale(deluge:da) locale(deluge:de) locale(deluge:el) locale(deluge:en_AU) locale(deluge:en_CA) locale(deluge:en_GB) locale(deluge:eo) locale(deluge:es) locale(deluge:et) locale(deluge:eu) locale(deluge:fa) locale(deluge:fi) locale(deluge:fr) locale(deluge:ga) locale(deluge:gl) locale(deluge:he) locale(deluge:hi) locale(deluge:hr) locale(deluge:hu) locale(deluge:id) locale(deluge:is) locale(deluge:it) locale(deluge:ja) locale(deluge:ka) locale(deluge:kk) locale(deluge:km) locale(deluge:kn) locale(deluge:ko) locale(deluge:lt) locale(deluge:lv) locale(deluge:mk) locale(deluge:ml) locale(deluge:ms) locale(deluge:nb) locale(deluge:nds) locale(deluge:nl) locale(deluge:nn) locale(deluge:oc) locale(deluge:pl) locale(deluge:pt) locale(deluge:pt_BR) locale(deluge:ro) locale(deluge:ru) locale(deluge:si) locale(deluge:sk) locale(deluge:sl) locale(deluge:sr) locale(deluge:sv) locale(deluge:ta) locale(deluge:te) locale(deluge:th) locale(deluge:tr) locale(deluge:uk) locale(deluge:vi) locale(deluge:zh_CN) locale(deluge:zh_HK) locale(deluge:zh_TW)"
RDEPENDS:${PN} += "deluge"

inherit rpm
