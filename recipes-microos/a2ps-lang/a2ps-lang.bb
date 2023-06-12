SUMMARY = "Translations for package a2ps"
DESCRIPTION = "Provides translations for the 'a2ps' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.15"

RPM_NAME = "a2ps-lang-4.15-1.3.noarch.rpm"
RPM_HASH = "9dd73a92ef4d91cd651e34fb740a44fe1a99fa1e1cff3b515adb39a1f53dc5417e8ba504b0452051b6479def4332409ed1dbb55c051d67ba0eaf94f8b7badb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "a2ps-lang \
a2ps-lang-all \
locale(a2ps:af) \
locale(a2ps:be) \
locale(a2ps:bg) \
locale(a2ps:ca) \
locale(a2ps:cs) \
locale(a2ps:da) \
locale(a2ps:de) \
locale(a2ps:el) \
locale(a2ps:en_GB) \
locale(a2ps:eo) \
locale(a2ps:es) \
locale(a2ps:et) \
locale(a2ps:eu) \
locale(a2ps:fi) \
locale(a2ps:fr) \
locale(a2ps:ga) \
locale(a2ps:gl) \
locale(a2ps:hr) \
locale(a2ps:hu) \
locale(a2ps:id) \
locale(a2ps:it) \
locale(a2ps:ja) \
locale(a2ps:ka) \
locale(a2ps:ko) \
locale(a2ps:ms) \
locale(a2ps:nb) \
locale(a2ps:nl) \
locale(a2ps:pl) \
locale(a2ps:pt) \
locale(a2ps:pt_BR) \
locale(a2ps:ro) \
locale(a2ps:ru) \
locale(a2ps:sk) \
locale(a2ps:sl) \
locale(a2ps:sr) \
locale(a2ps:sv) \
locale(a2ps:th) \
locale(a2ps:tr) \
locale(a2ps:uk) \
locale(a2ps:vi) \
locale(a2ps:zh_CN) \
locale(a2ps:zh_TW)"
RDEPENDS:${PN} += "a2ps"

inherit rpm
