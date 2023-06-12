SUMMARY = "Translations for package NetworkManager-l2tp"
DESCRIPTION = "Provides translations for the 'NetworkManager-l2tp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.8"

RPM_NAME = "NetworkManager-l2tp-lang-1.20.8-1.4.noarch.rpm"
RPM_HASH = "d31456dc9585695d58a5c40d5d1e2c8c7af4f9346507aa2c8fcdd62a8b0e2aab71c4f3e9f31e9b62b7620d923cf27d35f8b8fee3e08e49c41750d79a2379b816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-l2tp-lang \
NetworkManager-l2tp-lang-all \
locale(NetworkManager-l2tp:ar) \
locale(NetworkManager-l2tp:as) \
locale(NetworkManager-l2tp:be) \
locale(NetworkManager-l2tp:be@latin) \
locale(NetworkManager-l2tp:bg) \
locale(NetworkManager-l2tp:bn_IN) \
locale(NetworkManager-l2tp:bs) \
locale(NetworkManager-l2tp:ca) \
locale(NetworkManager-l2tp:ca@valencia) \
locale(NetworkManager-l2tp:cs) \
locale(NetworkManager-l2tp:da) \
locale(NetworkManager-l2tp:de) \
locale(NetworkManager-l2tp:dz) \
locale(NetworkManager-l2tp:el) \
locale(NetworkManager-l2tp:en_GB) \
locale(NetworkManager-l2tp:eo) \
locale(NetworkManager-l2tp:es) \
locale(NetworkManager-l2tp:et) \
locale(NetworkManager-l2tp:eu) \
locale(NetworkManager-l2tp:fa) \
locale(NetworkManager-l2tp:fi) \
locale(NetworkManager-l2tp:fr) \
locale(NetworkManager-l2tp:fur) \
locale(NetworkManager-l2tp:gl) \
locale(NetworkManager-l2tp:gu) \
locale(NetworkManager-l2tp:he) \
locale(NetworkManager-l2tp:hr) \
locale(NetworkManager-l2tp:hu) \
locale(NetworkManager-l2tp:id) \
locale(NetworkManager-l2tp:it) \
locale(NetworkManager-l2tp:ja) \
locale(NetworkManager-l2tp:ka) \
locale(NetworkManager-l2tp:kn) \
locale(NetworkManager-l2tp:ko) \
locale(NetworkManager-l2tp:lt) \
locale(NetworkManager-l2tp:lv) \
locale(NetworkManager-l2tp:mk) \
locale(NetworkManager-l2tp:mr) \
locale(NetworkManager-l2tp:nb) \
locale(NetworkManager-l2tp:nl) \
locale(NetworkManager-l2tp:oc) \
locale(NetworkManager-l2tp:or) \
locale(NetworkManager-l2tp:pa) \
locale(NetworkManager-l2tp:pl) \
locale(NetworkManager-l2tp:pt) \
locale(NetworkManager-l2tp:pt_BR) \
locale(NetworkManager-l2tp:ro) \
locale(NetworkManager-l2tp:ru) \
locale(NetworkManager-l2tp:sk) \
locale(NetworkManager-l2tp:sl) \
locale(NetworkManager-l2tp:sr) \
locale(NetworkManager-l2tp:sr@latin) \
locale(NetworkManager-l2tp:sv) \
locale(NetworkManager-l2tp:ta) \
locale(NetworkManager-l2tp:te) \
locale(NetworkManager-l2tp:th) \
locale(NetworkManager-l2tp:tr) \
locale(NetworkManager-l2tp:ug) \
locale(NetworkManager-l2tp:uk) \
locale(NetworkManager-l2tp:vi) \
locale(NetworkManager-l2tp:zh_CN) \
locale(NetworkManager-l2tp:zh_HK) \
locale(NetworkManager-l2tp:zh_TW)"
RDEPENDS:${PN} += "NetworkManager-l2tp"

inherit rpm
