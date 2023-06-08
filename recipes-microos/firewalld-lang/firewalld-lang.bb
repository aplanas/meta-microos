SUMMARY = "Translations for package firewalld"
DESCRIPTION = "Provides translations for the 'firewalld' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "firewalld-lang-1.3.2-1.1.noarch.rpm"
RPM_HASH = "8d0591f3d2b97645ae2aecf56f819c88d1f25b300735f6e2ed656a16d98e3ad7f676350d340d0f352bb60342213dbca90d2fbf07f38e763e616809802b365912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-lang firewalld-lang-all locale(firewalld:ar) locale(firewalld:as) locale(firewalld:ast) locale(firewalld:bg) locale(firewalld:bn_IN) locale(firewalld:ca) locale(firewalld:cs) locale(firewalld:da) locale(firewalld:de) locale(firewalld:el) locale(firewalld:en_GB) locale(firewalld:en_US) locale(firewalld:es) locale(firewalld:et) locale(firewalld:eu) locale(firewalld:fa) locale(firewalld:fi) locale(firewalld:fr) locale(firewalld:gl) locale(firewalld:gu) locale(firewalld:hi) locale(firewalld:hr) locale(firewalld:hu) locale(firewalld:ia) locale(firewalld:id) locale(firewalld:it) locale(firewalld:ja) locale(firewalld:ka) locale(firewalld:kn) locale(firewalld:ko) locale(firewalld:lt) locale(firewalld:ml) locale(firewalld:mr) locale(firewalld:nl) locale(firewalld:or) locale(firewalld:pa) locale(firewalld:pl) locale(firewalld:pt) locale(firewalld:pt_BR) locale(firewalld:ru) locale(firewalld:si) locale(firewalld:sk) locale(firewalld:sq) locale(firewalld:sr) locale(firewalld:sr@latin) locale(firewalld:sv) locale(firewalld:ta) locale(firewalld:te) locale(firewalld:tr) locale(firewalld:uk) locale(firewalld:zh_CN) locale(firewalld:zh_TW)"
RDEPENDS:${PN} += "firewalld"

inherit rpm
