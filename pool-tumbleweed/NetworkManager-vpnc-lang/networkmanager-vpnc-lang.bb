SUMMARY = "Translations for package NetworkManager-vpnc"
DESCRIPTION = "Provides translations for the 'NetworkManager-vpnc' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "NetworkManager-vpnc-lang-1.2.8-1.7.noarch.rpm"
RPM_HASH = "078fc24e81d4f0a9b4e183e9cd587e4bf3c661aa0c19baa608511c544176bdd8cd2b018311aaf0e23710f2f5cb92dd52cc4bd9706d5d38bc09dddd1cbf44f73a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-vpnc-lang \
NetworkManager-vpnc-lang-all \
locale-NetworkManager-vpnc-ar \
locale-NetworkManager-vpnc-as \
locale-NetworkManager-vpnc-bg \
locale-NetworkManager-vpnc-bn-IN \
locale-NetworkManager-vpnc-bs \
locale-NetworkManager-vpnc-ca \
locale-NetworkManager-vpnc-ca@valencia \
locale-NetworkManager-vpnc-cs \
locale-NetworkManager-vpnc-da \
locale-NetworkManager-vpnc-de \
locale-NetworkManager-vpnc-dz \
locale-NetworkManager-vpnc-el \
locale-NetworkManager-vpnc-en-GB \
locale-NetworkManager-vpnc-eo \
locale-NetworkManager-vpnc-es \
locale-NetworkManager-vpnc-et \
locale-NetworkManager-vpnc-eu \
locale-NetworkManager-vpnc-fa \
locale-NetworkManager-vpnc-fi \
locale-NetworkManager-vpnc-fr \
locale-NetworkManager-vpnc-fur \
locale-NetworkManager-vpnc-gl \
locale-NetworkManager-vpnc-gu \
locale-NetworkManager-vpnc-he \
locale-NetworkManager-vpnc-hr \
locale-NetworkManager-vpnc-hu \
locale-NetworkManager-vpnc-id \
locale-NetworkManager-vpnc-it \
locale-NetworkManager-vpnc-ja \
locale-NetworkManager-vpnc-ka \
locale-NetworkManager-vpnc-kn \
locale-NetworkManager-vpnc-ko \
locale-NetworkManager-vpnc-lt \
locale-NetworkManager-vpnc-lv \
locale-NetworkManager-vpnc-mk \
locale-NetworkManager-vpnc-mr \
locale-NetworkManager-vpnc-nb \
locale-NetworkManager-vpnc-nl \
locale-NetworkManager-vpnc-or \
locale-NetworkManager-vpnc-pa \
locale-NetworkManager-vpnc-pl \
locale-NetworkManager-vpnc-pt \
locale-NetworkManager-vpnc-pt-BR \
locale-NetworkManager-vpnc-ro \
locale-NetworkManager-vpnc-ru \
locale-NetworkManager-vpnc-sk \
locale-NetworkManager-vpnc-sl \
locale-NetworkManager-vpnc-sr \
locale-NetworkManager-vpnc-sr@latin \
locale-NetworkManager-vpnc-sv \
locale-NetworkManager-vpnc-ta \
locale-NetworkManager-vpnc-te \
locale-NetworkManager-vpnc-th \
locale-NetworkManager-vpnc-tr \
locale-NetworkManager-vpnc-ug \
locale-NetworkManager-vpnc-uk \
locale-NetworkManager-vpnc-vi \
locale-NetworkManager-vpnc-zh-CN \
locale-NetworkManager-vpnc-zh-HK \
locale-NetworkManager-vpnc-zh-TW"

RDEPENDS:${PN} += "NetworkManager-vpnc"

inherit rpm
