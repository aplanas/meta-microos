SUMMARY = "Translations for package thunar-plugin-vcs"
DESCRIPTION = "Provides translations for the 'thunar-plugin-vcs' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0"

RPM_NAME = "thunar-plugin-vcs-lang-0.2.0-1.23.noarch.rpm"
RPM_HASH = "518c4f0443eac0c3f9a49d2ffc4f29a63ac6184e67284a7b890b7a3d9ec0468b124afd9ec07bdf780f1f488022853b03dce82052c02387ac5ac434a1b316d2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(thunar-plugin-vcs:ar) \
locale(thunar-plugin-vcs:be) \
locale(thunar-plugin-vcs:bg) \
locale(thunar-plugin-vcs:ca) \
locale(thunar-plugin-vcs:cs) \
locale(thunar-plugin-vcs:da) \
locale(thunar-plugin-vcs:de) \
locale(thunar-plugin-vcs:el) \
locale(thunar-plugin-vcs:en_AU) \
locale(thunar-plugin-vcs:en_GB) \
locale(thunar-plugin-vcs:es) \
locale(thunar-plugin-vcs:eu) \
locale(thunar-plugin-vcs:fi) \
locale(thunar-plugin-vcs:fr) \
locale(thunar-plugin-vcs:gl) \
locale(thunar-plugin-vcs:he) \
locale(thunar-plugin-vcs:hr) \
locale(thunar-plugin-vcs:hu) \
locale(thunar-plugin-vcs:id) \
locale(thunar-plugin-vcs:is) \
locale(thunar-plugin-vcs:it) \
locale(thunar-plugin-vcs:ko) \
locale(thunar-plugin-vcs:lt) \
locale(thunar-plugin-vcs:lv) \
locale(thunar-plugin-vcs:ms) \
locale(thunar-plugin-vcs:nb) \
locale(thunar-plugin-vcs:nl) \
locale(thunar-plugin-vcs:oc) \
locale(thunar-plugin-vcs:pl) \
locale(thunar-plugin-vcs:pt) \
locale(thunar-plugin-vcs:pt_BR) \
locale(thunar-plugin-vcs:ru) \
locale(thunar-plugin-vcs:sk) \
locale(thunar-plugin-vcs:sl) \
locale(thunar-plugin-vcs:sv) \
locale(thunar-plugin-vcs:th) \
locale(thunar-plugin-vcs:tr) \
locale(thunar-plugin-vcs:ug) \
locale(thunar-plugin-vcs:uk) \
locale(thunar-plugin-vcs:zh_CN) \
locale(thunar-plugin-vcs:zh_TW) \
thunar-plugin-vcs-lang \
thunar-plugin-vcs-lang-all"

RDEPENDS:${PN} += "thunar-plugin-vcs"

inherit rpm
