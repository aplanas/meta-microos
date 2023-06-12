SUMMARY = "Translations for package PackageKit"
DESCRIPTION = "Provides translations for the 'PackageKit' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-lang-1.2.5-9.3.noarch.rpm"
RPM_HASH = "34f0c5b7f557dcce35cd23b523ce964d74c17825b7046371215550afe41871a1d64541480d495e3f476f706fc1c5af277a7594cd62deb502891e5f751a91ad2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-lang \
PackageKit-lang-all \
locale(PackageKit:ar) \
locale(PackageKit:as) \
locale(PackageKit:ast) \
locale(PackageKit:az) \
locale(PackageKit:bg) \
locale(PackageKit:bn_IN) \
locale(PackageKit:br) \
locale(PackageKit:ca) \
locale(PackageKit:ca@valencia) \
locale(PackageKit:cs) \
locale(PackageKit:cy) \
locale(PackageKit:da) \
locale(PackageKit:de) \
locale(PackageKit:el) \
locale(PackageKit:en_GB) \
locale(PackageKit:eo) \
locale(PackageKit:es) \
locale(PackageKit:eu) \
locale(PackageKit:fa) \
locale(PackageKit:fi) \
locale(PackageKit:fr) \
locale(PackageKit:ga) \
locale(PackageKit:gl) \
locale(PackageKit:gu) \
locale(PackageKit:he) \
locale(PackageKit:hi) \
locale(PackageKit:hr) \
locale(PackageKit:hu) \
locale(PackageKit:ia) \
locale(PackageKit:id) \
locale(PackageKit:it) \
locale(PackageKit:ja) \
locale(PackageKit:ka) \
locale(PackageKit:kk) \
locale(PackageKit:kn) \
locale(PackageKit:ko) \
locale(PackageKit:lt) \
locale(PackageKit:lv) \
locale(PackageKit:ml) \
locale(PackageKit:mr) \
locale(PackageKit:ms) \
locale(PackageKit:nb) \
locale(PackageKit:nl) \
locale(PackageKit:nn) \
locale(PackageKit:oc) \
locale(PackageKit:or) \
locale(PackageKit:pa) \
locale(PackageKit:pl) \
locale(PackageKit:pt) \
locale(PackageKit:pt_BR) \
locale(PackageKit:ro) \
locale(PackageKit:ru) \
locale(PackageKit:sk) \
locale(PackageKit:sl) \
locale(PackageKit:sq) \
locale(PackageKit:sr) \
locale(PackageKit:sr@latin) \
locale(PackageKit:sv) \
locale(PackageKit:ta) \
locale(PackageKit:te) \
locale(PackageKit:th) \
locale(PackageKit:tr) \
locale(PackageKit:uk) \
locale(PackageKit:vi) \
locale(PackageKit:wa) \
locale(PackageKit:zh_CN) \
locale(PackageKit:zh_HK) \
locale(PackageKit:zh_TW)"
RDEPENDS:${PN} += "PackageKit"

inherit rpm
