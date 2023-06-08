SUMMARY = "Translations for package NetworkManager"
DESCRIPTION = "Provides translations for the 'NetworkManager' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-lang-1.42.6-1.1.noarch.rpm"
RPM_HASH = "fe2cbac7068d68283bdf7ce3d2315a7fff7eb698f7bede3c6d0c46a598bb045702af5c87ff61b6925e42bfd968910614932436431ec6ca6ac25c12394088a16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-lang NetworkManager-lang-all locale(NetworkManager:as) locale(NetworkManager:be@latin) locale(NetworkManager:bg) locale(NetworkManager:bn_IN) locale(NetworkManager:bs) locale(NetworkManager:ca) locale(NetworkManager:cs) locale(NetworkManager:da) locale(NetworkManager:de) locale(NetworkManager:dz) locale(NetworkManager:el) locale(NetworkManager:en_CA) locale(NetworkManager:en_GB) locale(NetworkManager:eo) locale(NetworkManager:es) locale(NetworkManager:et) locale(NetworkManager:eu) locale(NetworkManager:fi) locale(NetworkManager:fr) locale(NetworkManager:gd) locale(NetworkManager:gl) locale(NetworkManager:gu) locale(NetworkManager:he) locale(NetworkManager:hi) locale(NetworkManager:hr) locale(NetworkManager:hu) locale(NetworkManager:id) locale(NetworkManager:it) locale(NetworkManager:ja) locale(NetworkManager:ka) locale(NetworkManager:kn) locale(NetworkManager:ko) locale(NetworkManager:lt) locale(NetworkManager:lv) locale(NetworkManager:mk) locale(NetworkManager:ml) locale(NetworkManager:mr) locale(NetworkManager:nb) locale(NetworkManager:ne) locale(NetworkManager:nl) locale(NetworkManager:oc) locale(NetworkManager:or) locale(NetworkManager:pa) locale(NetworkManager:pl) locale(NetworkManager:pt) locale(NetworkManager:pt_BR) locale(NetworkManager:ro) locale(NetworkManager:ru) locale(NetworkManager:sk) locale(NetworkManager:sl) locale(NetworkManager:sq) locale(NetworkManager:sr) locale(NetworkManager:sr@latin) locale(NetworkManager:sv) locale(NetworkManager:ta) locale(NetworkManager:te) locale(NetworkManager:th) locale(NetworkManager:tr) locale(NetworkManager:uk) locale(NetworkManager:vi) locale(NetworkManager:wa) locale(NetworkManager:zh_CN) locale(NetworkManager:zh_HK) locale(NetworkManager:zh_TW)"
RDEPENDS:${PN} += "NetworkManager"

inherit rpm
