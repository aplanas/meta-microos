SUMMARY = "Translations for package clamtk"
DESCRIPTION = "Provides translations for the 'clamtk' package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.14"

RPM_NAME = "clamtk-lang-6.14-1.8.noarch.rpm"
RPM_HASH = "d061bc19a3bf60eabd1ffcd70d5be20863bfb1101a74187df0f1edd6e0ebff8c8eaa06056b632ea5cc2862c051770d2e96fb11854730f7cf365c423b1e126421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamtk-lang \
clamtk-lang-all \
locale(clamtk:af) \
locale(clamtk:ar) \
locale(clamtk:az) \
locale(clamtk:bg) \
locale(clamtk:bs) \
locale(clamtk:ca) \
locale(clamtk:cs) \
locale(clamtk:da) \
locale(clamtk:de) \
locale(clamtk:el) \
locale(clamtk:en_AU) \
locale(clamtk:en_CA) \
locale(clamtk:en_GB) \
locale(clamtk:eo) \
locale(clamtk:es) \
locale(clamtk:eu) \
locale(clamtk:fi) \
locale(clamtk:fr) \
locale(clamtk:ga) \
locale(clamtk:gl) \
locale(clamtk:he) \
locale(clamtk:hr) \
locale(clamtk:hu) \
locale(clamtk:id) \
locale(clamtk:it) \
locale(clamtk:ja) \
locale(clamtk:kk) \
locale(clamtk:km) \
locale(clamtk:ko) \
locale(clamtk:lt) \
locale(clamtk:lv) \
locale(clamtk:mr) \
locale(clamtk:ms) \
locale(clamtk:nb) \
locale(clamtk:nl) \
locale(clamtk:nn) \
locale(clamtk:pa) \
locale(clamtk:pl) \
locale(clamtk:pt) \
locale(clamtk:pt_BR) \
locale(clamtk:ro) \
locale(clamtk:ru) \
locale(clamtk:si) \
locale(clamtk:sk) \
locale(clamtk:sl) \
locale(clamtk:sr@latin) \
locale(clamtk:sv) \
locale(clamtk:ta) \
locale(clamtk:te) \
locale(clamtk:th) \
locale(clamtk:tr) \
locale(clamtk:ug) \
locale(clamtk:uk) \
locale(clamtk:zh_CN) \
locale(clamtk:zh_TW)"

RDEPENDS:${PN} += "clamtk"

inherit rpm
