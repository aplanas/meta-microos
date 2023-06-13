SUMMARY = "Translations for package kio_perldoc"
DESCRIPTION = "Provides translations for the 'kio_perldoc' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kio_perldoc-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "630734534b3bce6435b0079a2c16c1f5ccf815c168bb686ab38dc6a9a27bdca224fcd501eaf4c72efb25995add6cf6e426fe236e558fb795356c9c546a62cb2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio_perldoc-lang \
kio_perldoc-lang-all \
locale(kio_perldoc:bs) \
locale(kio_perldoc:ca) \
locale(kio_perldoc:ca@valencia) \
locale(kio_perldoc:cs) \
locale(kio_perldoc:da) \
locale(kio_perldoc:de) \
locale(kio_perldoc:el) \
locale(kio_perldoc:en_GB) \
locale(kio_perldoc:eo) \
locale(kio_perldoc:es) \
locale(kio_perldoc:et) \
locale(kio_perldoc:eu) \
locale(kio_perldoc:fi) \
locale(kio_perldoc:fr) \
locale(kio_perldoc:ga) \
locale(kio_perldoc:gl) \
locale(kio_perldoc:hi) \
locale(kio_perldoc:hu) \
locale(kio_perldoc:it) \
locale(kio_perldoc:ja) \
locale(kio_perldoc:ka) \
locale(kio_perldoc:kk) \
locale(kio_perldoc:ko) \
locale(kio_perldoc:lt) \
locale(kio_perldoc:mr) \
locale(kio_perldoc:nb) \
locale(kio_perldoc:nds) \
locale(kio_perldoc:nl) \
locale(kio_perldoc:nn) \
locale(kio_perldoc:pa) \
locale(kio_perldoc:pl) \
locale(kio_perldoc:pt) \
locale(kio_perldoc:pt_BR) \
locale(kio_perldoc:ru) \
locale(kio_perldoc:sk) \
locale(kio_perldoc:sl) \
locale(kio_perldoc:sq) \
locale(kio_perldoc:sv) \
locale(kio_perldoc:tr) \
locale(kio_perldoc:ug) \
locale(kio_perldoc:uk) \
locale(kio_perldoc:zh_CN) \
locale(kio_perldoc:zh_TW)"

RDEPENDS:${PN} += "kio_perldoc"

inherit rpm
