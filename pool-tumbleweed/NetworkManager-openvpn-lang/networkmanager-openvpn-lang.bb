SUMMARY = "Translations for package NetworkManager-openvpn"
DESCRIPTION = "Provides translations for the 'NetworkManager-openvpn' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.2"

RPM_NAME = "NetworkManager-openvpn-lang-1.10.2-1.3.noarch.rpm"
RPM_HASH = "585d9477cca9eb821f234160c9fefa91da64b9abe07a2190e4ba194fd2042156a70d8411c84e354488617412de485af985cc9b1a69d185aa3020e19917b092d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-openvpn-lang \
NetworkManager-openvpn-lang-all \
locale(NetworkManager-openvpn:ar) \
locale(NetworkManager-openvpn:as) \
locale(NetworkManager-openvpn:be) \
locale(NetworkManager-openvpn:bg) \
locale(NetworkManager-openvpn:bs) \
locale(NetworkManager-openvpn:ca) \
locale(NetworkManager-openvpn:ca@valencia) \
locale(NetworkManager-openvpn:cs) \
locale(NetworkManager-openvpn:da) \
locale(NetworkManager-openvpn:de) \
locale(NetworkManager-openvpn:dz) \
locale(NetworkManager-openvpn:el) \
locale(NetworkManager-openvpn:en_GB) \
locale(NetworkManager-openvpn:eo) \
locale(NetworkManager-openvpn:es) \
locale(NetworkManager-openvpn:et) \
locale(NetworkManager-openvpn:eu) \
locale(NetworkManager-openvpn:fa) \
locale(NetworkManager-openvpn:fi) \
locale(NetworkManager-openvpn:fr) \
locale(NetworkManager-openvpn:fur) \
locale(NetworkManager-openvpn:gl) \
locale(NetworkManager-openvpn:gu) \
locale(NetworkManager-openvpn:he) \
locale(NetworkManager-openvpn:hr) \
locale(NetworkManager-openvpn:hu) \
locale(NetworkManager-openvpn:id) \
locale(NetworkManager-openvpn:it) \
locale(NetworkManager-openvpn:ja) \
locale(NetworkManager-openvpn:ka) \
locale(NetworkManager-openvpn:kn) \
locale(NetworkManager-openvpn:ko) \
locale(NetworkManager-openvpn:lt) \
locale(NetworkManager-openvpn:lv) \
locale(NetworkManager-openvpn:mk) \
locale(NetworkManager-openvpn:mr) \
locale(NetworkManager-openvpn:nb) \
locale(NetworkManager-openvpn:nl) \
locale(NetworkManager-openvpn:pa) \
locale(NetworkManager-openvpn:pl) \
locale(NetworkManager-openvpn:pt) \
locale(NetworkManager-openvpn:pt_BR) \
locale(NetworkManager-openvpn:ro) \
locale(NetworkManager-openvpn:ru) \
locale(NetworkManager-openvpn:sk) \
locale(NetworkManager-openvpn:sl) \
locale(NetworkManager-openvpn:sr) \
locale(NetworkManager-openvpn:sr@latin) \
locale(NetworkManager-openvpn:sv) \
locale(NetworkManager-openvpn:ta) \
locale(NetworkManager-openvpn:te) \
locale(NetworkManager-openvpn:th) \
locale(NetworkManager-openvpn:tr) \
locale(NetworkManager-openvpn:ug) \
locale(NetworkManager-openvpn:uk) \
locale(NetworkManager-openvpn:vi) \
locale(NetworkManager-openvpn:zh_CN) \
locale(NetworkManager-openvpn:zh_HK) \
locale(NetworkManager-openvpn:zh_TW)"

RDEPENDS:${PN} += "NetworkManager-openvpn"

inherit rpm
