SUMMARY = "Translations for package goobox"
DESCRIPTION = "Provides translations for the 'goobox' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "goobox-lang-3.6.0-3.9.noarch.rpm"
RPM_HASH = "0a73f1a859467de212e259a3a33cdbbca059217e80fcb8902dfef095ef3c6b6be1d8e6f1b494eb31d500e7f602bf9620d4cf8714261607649cb0ef2ffa487954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goobox-lang \
goobox-lang-all \
locale(goobox:ar) \
locale(goobox:bg) \
locale(goobox:bs) \
locale(goobox:ca) \
locale(goobox:cs) \
locale(goobox:da) \
locale(goobox:de) \
locale(goobox:dz) \
locale(goobox:el) \
locale(goobox:en_CA) \
locale(goobox:en_GB) \
locale(goobox:es) \
locale(goobox:eu) \
locale(goobox:fi) \
locale(goobox:fr) \
locale(goobox:fur) \
locale(goobox:gl) \
locale(goobox:he) \
locale(goobox:hu) \
locale(goobox:id) \
locale(goobox:it) \
locale(goobox:ja) \
locale(goobox:ko) \
locale(goobox:lt) \
locale(goobox:lv) \
locale(goobox:nb) \
locale(goobox:ne) \
locale(goobox:nl) \
locale(goobox:oc) \
locale(goobox:pa) \
locale(goobox:pl) \
locale(goobox:pt) \
locale(goobox:pt_BR) \
locale(goobox:ro) \
locale(goobox:ru) \
locale(goobox:sl) \
locale(goobox:sq) \
locale(goobox:sr) \
locale(goobox:sr@latin) \
locale(goobox:sv) \
locale(goobox:tr) \
locale(goobox:vi) \
locale(goobox:zh_CN) \
locale(goobox:zh_TW)"

RDEPENDS:${PN} += "goobox"

inherit rpm
