SUMMARY = "Translations for package NetworkManager-openconnect"
DESCRIPTION = "Provides translations for the 'NetworkManager-openconnect' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.2.10"

RPM_NAME = "NetworkManager-openconnect-lang-1.2.10-1.1.noarch.rpm"
RPM_HASH = "138b82a6285d665e19a6fa0fd367b3531061de455d5bef63c139a478330e81385e1f8e23b3c45cc53839d8fff64e02500c1a9a728795929d2cae4901ee292954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-openconnect-lang \
NetworkManager-openconnect-lang-all \
locale(NetworkManager-openconnect:ar) \
locale(NetworkManager-openconnect:as) \
locale(NetworkManager-openconnect:bg) \
locale(NetworkManager-openconnect:bn_IN) \
locale(NetworkManager-openconnect:bs) \
locale(NetworkManager-openconnect:ca) \
locale(NetworkManager-openconnect:ca@valencia) \
locale(NetworkManager-openconnect:cs) \
locale(NetworkManager-openconnect:da) \
locale(NetworkManager-openconnect:de) \
locale(NetworkManager-openconnect:el) \
locale(NetworkManager-openconnect:en_GB) \
locale(NetworkManager-openconnect:eo) \
locale(NetworkManager-openconnect:es) \
locale(NetworkManager-openconnect:et) \
locale(NetworkManager-openconnect:eu) \
locale(NetworkManager-openconnect:fa) \
locale(NetworkManager-openconnect:fi) \
locale(NetworkManager-openconnect:fr) \
locale(NetworkManager-openconnect:gl) \
locale(NetworkManager-openconnect:gu) \
locale(NetworkManager-openconnect:he) \
locale(NetworkManager-openconnect:hr) \
locale(NetworkManager-openconnect:hu) \
locale(NetworkManager-openconnect:id) \
locale(NetworkManager-openconnect:it) \
locale(NetworkManager-openconnect:ka) \
locale(NetworkManager-openconnect:kn) \
locale(NetworkManager-openconnect:ko) \
locale(NetworkManager-openconnect:lt) \
locale(NetworkManager-openconnect:lv) \
locale(NetworkManager-openconnect:mr) \
locale(NetworkManager-openconnect:nb) \
locale(NetworkManager-openconnect:nl) \
locale(NetworkManager-openconnect:or) \
locale(NetworkManager-openconnect:pa) \
locale(NetworkManager-openconnect:pl) \
locale(NetworkManager-openconnect:pt) \
locale(NetworkManager-openconnect:pt_BR) \
locale(NetworkManager-openconnect:ro) \
locale(NetworkManager-openconnect:ru) \
locale(NetworkManager-openconnect:sk) \
locale(NetworkManager-openconnect:sl) \
locale(NetworkManager-openconnect:sr) \
locale(NetworkManager-openconnect:sr@latin) \
locale(NetworkManager-openconnect:sv) \
locale(NetworkManager-openconnect:ta) \
locale(NetworkManager-openconnect:te) \
locale(NetworkManager-openconnect:tr) \
locale(NetworkManager-openconnect:ug) \
locale(NetworkManager-openconnect:uk) \
locale(NetworkManager-openconnect:vi) \
locale(NetworkManager-openconnect:zh_CN) \
locale(NetworkManager-openconnect:zh_HK) \
locale(NetworkManager-openconnect:zh_TW)"

RDEPENDS:${PN} += "NetworkManager-openconnect"

inherit rpm
