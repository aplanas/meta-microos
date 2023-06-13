SUMMARY = "Translations for package NetworkManager-strongswan"
DESCRIPTION = "Provides translations for the 'NetworkManager-strongswan' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "NetworkManager-strongswan-lang-1.5.2-1.9.noarch.rpm"
RPM_HASH = "b3194a5ade70716d051514b3d5eac867dbae3df2100b666c913f714e7aec69dd9fd4bd72f2cf2fe593630bc69a21df5a3fefa3d3cbe0d12021e2157b3c50388b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-strongswan-lang \
NetworkManager-strongswan-lang-all \
locale(NetworkManager-strongswan:de)"

RDEPENDS:${PN} += "NetworkManager-strongswan"

inherit rpm
