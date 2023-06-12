SUMMARY = "Translations for package bleachbit"
DESCRIPTION = "Provides translations for the 'bleachbit' package."
LICENSE = "GPL-3.0-only"

PV = "4.4.2"

RPM_NAME = "bleachbit-lang-4.4.2-2.1.noarch.rpm"
RPM_HASH = "59dc99816e16e56cf5355415c861db3d5bb10fc6775d86b0aab14a2db1b500e16c3abcefd357517bfc300b94480d919d9a16f3d1e0f08dc90c262bf3345e3ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bleachbit-lang \
bleachbit-lang-all \
locale(bleachbit:af) \
locale(bleachbit:ar) \
locale(bleachbit:ast) \
locale(bleachbit:be) \
locale(bleachbit:bg) \
locale(bleachbit:bn) \
locale(bleachbit:bs) \
locale(bleachbit:ca) \
locale(bleachbit:cs) \
locale(bleachbit:da) \
locale(bleachbit:de) \
locale(bleachbit:el) \
locale(bleachbit:en_AU) \
locale(bleachbit:en_CA) \
locale(bleachbit:en_GB) \
locale(bleachbit:eo) \
locale(bleachbit:es) \
locale(bleachbit:et) \
locale(bleachbit:eu) \
locale(bleachbit:fa) \
locale(bleachbit:fi) \
locale(bleachbit:fr) \
locale(bleachbit:gl) \
locale(bleachbit:he) \
locale(bleachbit:hi) \
locale(bleachbit:hr) \
locale(bleachbit:hu) \
locale(bleachbit:ia) \
locale(bleachbit:id) \
locale(bleachbit:it) \
locale(bleachbit:ja) \
locale(bleachbit:ko) \
locale(bleachbit:lt) \
locale(bleachbit:lv) \
locale(bleachbit:ms) \
locale(bleachbit:nb) \
locale(bleachbit:nds) \
locale(bleachbit:nl) \
locale(bleachbit:nn) \
locale(bleachbit:pl) \
locale(bleachbit:pt) \
locale(bleachbit:pt_BR) \
locale(bleachbit:ro) \
locale(bleachbit:ru) \
locale(bleachbit:sk) \
locale(bleachbit:sl) \
locale(bleachbit:sq) \
locale(bleachbit:sr) \
locale(bleachbit:sv) \
locale(bleachbit:ta) \
locale(bleachbit:te) \
locale(bleachbit:th) \
locale(bleachbit:tr) \
locale(bleachbit:ug) \
locale(bleachbit:uk) \
locale(bleachbit:vi) \
locale(bleachbit:zh_CN) \
locale(bleachbit:zh_TW)"
RDEPENDS:${PN} += "bleachbit"

inherit rpm
