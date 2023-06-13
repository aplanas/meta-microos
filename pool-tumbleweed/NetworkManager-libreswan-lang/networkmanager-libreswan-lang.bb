SUMMARY = "Translations for package NetworkManager-libreswan"
DESCRIPTION = "Provides translations for the 'NetworkManager-libreswan' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.16"

RPM_NAME = "NetworkManager-libreswan-lang-1.2.16-2.3.noarch.rpm"
RPM_HASH = "2dbf95101da975a2f89bb5b43e6de8c6c07619260527b3ae3827fb25cb0dfcaeacbb3f3a65be6d4ad144b3064d50741941c2026d4c6123d0aa96e47336bff9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-libreswan-lang \
NetworkManager-libreswan-lang-all \
locale(NetworkManager-libreswan:ar) \
locale(NetworkManager-libreswan:bg) \
locale(NetworkManager-libreswan:bs) \
locale(NetworkManager-libreswan:ca) \
locale(NetworkManager-libreswan:cs) \
locale(NetworkManager-libreswan:da) \
locale(NetworkManager-libreswan:de) \
locale(NetworkManager-libreswan:dz) \
locale(NetworkManager-libreswan:el) \
locale(NetworkManager-libreswan:en_GB) \
locale(NetworkManager-libreswan:es) \
locale(NetworkManager-libreswan:et) \
locale(NetworkManager-libreswan:eu) \
locale(NetworkManager-libreswan:fi) \
locale(NetworkManager-libreswan:fr) \
locale(NetworkManager-libreswan:fur) \
locale(NetworkManager-libreswan:gl) \
locale(NetworkManager-libreswan:gu) \
locale(NetworkManager-libreswan:hr) \
locale(NetworkManager-libreswan:hu) \
locale(NetworkManager-libreswan:id) \
locale(NetworkManager-libreswan:it) \
locale(NetworkManager-libreswan:ja) \
locale(NetworkManager-libreswan:ka) \
locale(NetworkManager-libreswan:ko) \
locale(NetworkManager-libreswan:lt) \
locale(NetworkManager-libreswan:lv) \
locale(NetworkManager-libreswan:mk) \
locale(NetworkManager-libreswan:mr) \
locale(NetworkManager-libreswan:nb) \
locale(NetworkManager-libreswan:nl) \
locale(NetworkManager-libreswan:oc) \
locale(NetworkManager-libreswan:or) \
locale(NetworkManager-libreswan:pa) \
locale(NetworkManager-libreswan:pl) \
locale(NetworkManager-libreswan:pt) \
locale(NetworkManager-libreswan:pt_BR) \
locale(NetworkManager-libreswan:ro) \
locale(NetworkManager-libreswan:ru) \
locale(NetworkManager-libreswan:sl) \
locale(NetworkManager-libreswan:sr) \
locale(NetworkManager-libreswan:sr@latin) \
locale(NetworkManager-libreswan:sv) \
locale(NetworkManager-libreswan:ta) \
locale(NetworkManager-libreswan:te) \
locale(NetworkManager-libreswan:th) \
locale(NetworkManager-libreswan:tr) \
locale(NetworkManager-libreswan:uk) \
locale(NetworkManager-libreswan:vi) \
locale(NetworkManager-libreswan:zh_CN) \
locale(NetworkManager-libreswan:zh_HK) \
locale(NetworkManager-libreswan:zh_TW)"

RDEPENDS:${PN} += "NetworkManager-libreswan"

inherit rpm
