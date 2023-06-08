SUMMARY = "Translations for package bijiben"
DESCRIPTION = "Provides translations for the 'bijiben' package."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "bijiben-lang-40.1-6.3.noarch.rpm"
RPM_HASH = "0c92d22d67277df692a227b1f0129031ff5a949816790cae86961c9572cb41ed26225ab4bfe28f377c50c84b71257a9f720860d62172bc3f97a725f700997a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bijiben-lang bijiben-lang-all locale(bijiben:af) locale(bijiben:ar) locale(bijiben:as) locale(bijiben:be) locale(bijiben:bs) locale(bijiben:ca) locale(bijiben:ca@valencia) locale(bijiben:cs) locale(bijiben:da) locale(bijiben:de) locale(bijiben:el) locale(bijiben:en_AU) locale(bijiben:en_GB) locale(bijiben:eo) locale(bijiben:es) locale(bijiben:et) locale(bijiben:eu) locale(bijiben:fa) locale(bijiben:fi) locale(bijiben:fr) locale(bijiben:fur) locale(bijiben:ga) locale(bijiben:gl) locale(bijiben:he) locale(bijiben:hr) locale(bijiben:hu) locale(bijiben:id) locale(bijiben:is) locale(bijiben:it) locale(bijiben:ja) locale(bijiben:kk) locale(bijiben:ko) locale(bijiben:lt) locale(bijiben:lv) locale(bijiben:ml) locale(bijiben:ms) locale(bijiben:nb) locale(bijiben:ne) locale(bijiben:nl) locale(bijiben:oc) locale(bijiben:or) locale(bijiben:pa) locale(bijiben:pl) locale(bijiben:pt) locale(bijiben:pt_BR) locale(bijiben:ro) locale(bijiben:ru) locale(bijiben:sk) locale(bijiben:sl) locale(bijiben:sr) locale(bijiben:sr@latin) locale(bijiben:sv) locale(bijiben:ta) locale(bijiben:te) locale(bijiben:tr) locale(bijiben:uk) locale(bijiben:vi) locale(bijiben:zh_CN) locale(bijiben:zh_HK) locale(bijiben:zh_TW)"
RDEPENDS:${PN} += "bijiben"

inherit rpm
