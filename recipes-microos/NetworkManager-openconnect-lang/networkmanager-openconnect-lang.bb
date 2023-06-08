SUMMARY = "Translations for package NetworkManager-openconnect"
DESCRIPTION = "Provides translations for the 'NetworkManager-openconnect' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "NetworkManager-openconnect-lang-1.2.8-2.3.noarch.rpm"
RPM_HASH = "9e0406d4cf31ee2595084908e726106237bab888bb7b3357d597e4a855d6d2eac3ea27dd1d02312c52ff7b70ab12711327ad7db1118a8661576eee2f3982a485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-openconnect-lang NetworkManager-openconnect-lang-all locale(NetworkManager-openconnect:ar) locale(NetworkManager-openconnect:as) locale(NetworkManager-openconnect:bg) locale(NetworkManager-openconnect:bn_IN) locale(NetworkManager-openconnect:bs) locale(NetworkManager-openconnect:ca) locale(NetworkManager-openconnect:ca@valencia) locale(NetworkManager-openconnect:cs) locale(NetworkManager-openconnect:da) locale(NetworkManager-openconnect:de) locale(NetworkManager-openconnect:el) locale(NetworkManager-openconnect:en_GB) locale(NetworkManager-openconnect:eo) locale(NetworkManager-openconnect:es) locale(NetworkManager-openconnect:et) locale(NetworkManager-openconnect:eu) locale(NetworkManager-openconnect:fa) locale(NetworkManager-openconnect:fi) locale(NetworkManager-openconnect:fr) locale(NetworkManager-openconnect:gl) locale(NetworkManager-openconnect:gu) locale(NetworkManager-openconnect:he) locale(NetworkManager-openconnect:hr) locale(NetworkManager-openconnect:hu) locale(NetworkManager-openconnect:id) locale(NetworkManager-openconnect:it) locale(NetworkManager-openconnect:kn) locale(NetworkManager-openconnect:ko) locale(NetworkManager-openconnect:lt) locale(NetworkManager-openconnect:lv) locale(NetworkManager-openconnect:mr) locale(NetworkManager-openconnect:nb) locale(NetworkManager-openconnect:nl) locale(NetworkManager-openconnect:or) locale(NetworkManager-openconnect:pa) locale(NetworkManager-openconnect:pl) locale(NetworkManager-openconnect:pt) locale(NetworkManager-openconnect:pt_BR) locale(NetworkManager-openconnect:ro) locale(NetworkManager-openconnect:ru) locale(NetworkManager-openconnect:sk) locale(NetworkManager-openconnect:sl) locale(NetworkManager-openconnect:sr) locale(NetworkManager-openconnect:sr@latin) locale(NetworkManager-openconnect:sv) locale(NetworkManager-openconnect:ta) locale(NetworkManager-openconnect:te) locale(NetworkManager-openconnect:tr) locale(NetworkManager-openconnect:ug) locale(NetworkManager-openconnect:uk) locale(NetworkManager-openconnect:vi) locale(NetworkManager-openconnect:zh_CN) locale(NetworkManager-openconnect:zh_HK) locale(NetworkManager-openconnect:zh_TW)"
RDEPENDS:${PN} += "NetworkManager-openconnect"

inherit rpm
