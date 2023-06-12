SUMMARY = "Translations for package NetworkManager-fortisslvpn"
DESCRIPTION = "Provides translations for the 'NetworkManager-fortisslvpn' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-fortisslvpn-lang-1.4.0-2.3.noarch.rpm"
RPM_HASH = "0e2db47cc68ce8cb550414d76de883deb964bee32ff55a9c3cccc5e7edb55f534ac344aaa44fc3ea37ea3784869c243693febed565f75b43c68f6d6b44c70c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-lang \
NetworkManager-fortisslvpn-lang-all \
locale(NetworkManager-fortisslvpn:ar) \
locale(NetworkManager-fortisslvpn:as) \
locale(NetworkManager-fortisslvpn:be@latin) \
locale(NetworkManager-fortisslvpn:bg) \
locale(NetworkManager-fortisslvpn:bn_IN) \
locale(NetworkManager-fortisslvpn:bs) \
locale(NetworkManager-fortisslvpn:ca) \
locale(NetworkManager-fortisslvpn:ca@valencia) \
locale(NetworkManager-fortisslvpn:cs) \
locale(NetworkManager-fortisslvpn:da) \
locale(NetworkManager-fortisslvpn:de) \
locale(NetworkManager-fortisslvpn:el) \
locale(NetworkManager-fortisslvpn:en_GB) \
locale(NetworkManager-fortisslvpn:eo) \
locale(NetworkManager-fortisslvpn:es) \
locale(NetworkManager-fortisslvpn:et) \
locale(NetworkManager-fortisslvpn:eu) \
locale(NetworkManager-fortisslvpn:fa) \
locale(NetworkManager-fortisslvpn:fi) \
locale(NetworkManager-fortisslvpn:fr) \
locale(NetworkManager-fortisslvpn:fur) \
locale(NetworkManager-fortisslvpn:gl) \
locale(NetworkManager-fortisslvpn:gu) \
locale(NetworkManager-fortisslvpn:he) \
locale(NetworkManager-fortisslvpn:hr) \
locale(NetworkManager-fortisslvpn:hu) \
locale(NetworkManager-fortisslvpn:id) \
locale(NetworkManager-fortisslvpn:it) \
locale(NetworkManager-fortisslvpn:ja) \
locale(NetworkManager-fortisslvpn:ka) \
locale(NetworkManager-fortisslvpn:kn) \
locale(NetworkManager-fortisslvpn:ko) \
locale(NetworkManager-fortisslvpn:lt) \
locale(NetworkManager-fortisslvpn:lv) \
locale(NetworkManager-fortisslvpn:mk) \
locale(NetworkManager-fortisslvpn:mr) \
locale(NetworkManager-fortisslvpn:nb) \
locale(NetworkManager-fortisslvpn:nl) \
locale(NetworkManager-fortisslvpn:oc) \
locale(NetworkManager-fortisslvpn:pa) \
locale(NetworkManager-fortisslvpn:pl) \
locale(NetworkManager-fortisslvpn:pt) \
locale(NetworkManager-fortisslvpn:pt_BR) \
locale(NetworkManager-fortisslvpn:ro) \
locale(NetworkManager-fortisslvpn:ru) \
locale(NetworkManager-fortisslvpn:sl) \
locale(NetworkManager-fortisslvpn:sr) \
locale(NetworkManager-fortisslvpn:sr@latin) \
locale(NetworkManager-fortisslvpn:sv) \
locale(NetworkManager-fortisslvpn:ta) \
locale(NetworkManager-fortisslvpn:te) \
locale(NetworkManager-fortisslvpn:th) \
locale(NetworkManager-fortisslvpn:tr) \
locale(NetworkManager-fortisslvpn:ug) \
locale(NetworkManager-fortisslvpn:uk) \
locale(NetworkManager-fortisslvpn:vi) \
locale(NetworkManager-fortisslvpn:zh_CN) \
locale(NetworkManager-fortisslvpn:zh_HK) \
locale(NetworkManager-fortisslvpn:zh_TW)"
RDEPENDS:${PN} += "NetworkManager-fortisslvpn"

inherit rpm
