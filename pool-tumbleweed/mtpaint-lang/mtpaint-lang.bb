SUMMARY = "Translations for package mtpaint"
DESCRIPTION = "Provides translations for the 'mtpaint' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.50"

RPM_NAME = "mtpaint-lang-3.50-1.10.noarch.rpm"
RPM_HASH = "a21cde9945d541fb38a8652a76362abee661af28fa9c1a17e43ce5359ca283e5bdd0ab307829488d3d1eeec67d9cb74e16be4d73a93d3d8e459c075c32f224f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mtpaint:cs) \
locale(mtpaint:de) \
locale(mtpaint:es) \
locale(mtpaint:fr) \
locale(mtpaint:gl) \
locale(mtpaint:hu) \
locale(mtpaint:it) \
locale(mtpaint:ja) \
locale(mtpaint:nl) \
locale(mtpaint:pl) \
locale(mtpaint:pt) \
locale(mtpaint:pt_BR) \
locale(mtpaint:ru) \
locale(mtpaint:sk) \
locale(mtpaint:sv) \
locale(mtpaint:tr) \
locale(mtpaint:zh_CN) \
locale(mtpaint:zh_TW) \
mtpaint-lang \
mtpaint-lang-all"

RDEPENDS:${PN} += "mtpaint"

inherit rpm
