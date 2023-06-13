SUMMARY = "Translations for package liferea"
DESCRIPTION = "Provides translations for the 'liferea' package."
LICENSE = "GPL-2.0-only"

PV = "1.14.5"

RPM_NAME = "liferea-lang-1.14.5-1.1.noarch.rpm"
RPM_HASH = "5ef06fb5230eab22f656d74ef88b7d11d9abb3a55140260867ec2739bd87f9f4ed71e9b12bbb8748e4986083ab1211cfe909b7842fc767863014ea847df0b66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liferea-lang \
liferea-lang-all \
locale(liferea:ar) \
locale(liferea:ast) \
locale(liferea:be@latin) \
locale(liferea:bg) \
locale(liferea:ca) \
locale(liferea:cs) \
locale(liferea:da) \
locale(liferea:de) \
locale(liferea:el) \
locale(liferea:en_GB) \
locale(liferea:es) \
locale(liferea:eu) \
locale(liferea:fi) \
locale(liferea:fr) \
locale(liferea:gl) \
locale(liferea:he) \
locale(liferea:hu) \
locale(liferea:id) \
locale(liferea:it) \
locale(liferea:ja) \
locale(liferea:ko) \
locale(liferea:lt) \
locale(liferea:lv) \
locale(liferea:mk) \
locale(liferea:nl) \
locale(liferea:pl) \
locale(liferea:pt) \
locale(liferea:pt_BR) \
locale(liferea:ro) \
locale(liferea:ru) \
locale(liferea:sk) \
locale(liferea:sq) \
locale(liferea:sv) \
locale(liferea:tr) \
locale(liferea:uk) \
locale(liferea:vi) \
locale(liferea:zh_CN) \
locale(liferea:zh_TW)"

RDEPENDS:${PN} += "liferea"

inherit rpm
