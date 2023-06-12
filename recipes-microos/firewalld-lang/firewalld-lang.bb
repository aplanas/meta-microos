SUMMARY = "Translations for package firewalld"
DESCRIPTION = "Provides translations for the 'firewalld' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-lang-1.3.2-2.1.noarch.rpm"
RPM_HASH = "45d45759734dbf3a5647a76fa15ec01809dd4c585f7d9f6300c49393d01ff571f020748fa08f20c306466452460f093fde5a3c9dbf3b112e5b78e16dfb49d444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-lang firewalld-lang-all locale(firewalld:ar) locale(firewalld:as) locale(firewalld:ast) locale(firewalld:bg) locale(firewalld:bn_IN) locale(firewalld:ca) locale(firewalld:cs) locale(firewalld:da) locale(firewalld:de) locale(firewalld:el) locale(firewalld:en_GB) locale(firewalld:en_US) locale(firewalld:es) locale(firewalld:et) locale(firewalld:eu) locale(firewalld:fa) locale(firewalld:fi) locale(firewalld:fr) locale(firewalld:gl) locale(firewalld:gu) locale(firewalld:hi) locale(firewalld:hr) locale(firewalld:hu) locale(firewalld:ia) locale(firewalld:id) locale(firewalld:it) locale(firewalld:ja) locale(firewalld:ka) locale(firewalld:kn) locale(firewalld:ko) locale(firewalld:lt) locale(firewalld:ml) locale(firewalld:mr) locale(firewalld:nl) locale(firewalld:or) locale(firewalld:pa) locale(firewalld:pl) locale(firewalld:pt) locale(firewalld:pt_BR) locale(firewalld:ru) locale(firewalld:si) locale(firewalld:sk) locale(firewalld:sq) locale(firewalld:sr) locale(firewalld:sr@latin) locale(firewalld:sv) locale(firewalld:ta) locale(firewalld:te) locale(firewalld:tr) locale(firewalld:uk) locale(firewalld:zh_CN) locale(firewalld:zh_TW)"
RDEPENDS:${PN} += "firewalld"

inherit rpm
