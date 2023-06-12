SUMMARY = "Translations for package plasma5-nano"
DESCRIPTION = "Provides translations for the 'plasma5-nano' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-nano-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "1c1b0e4c4a032de90f87d5832ed0a3d7489b42e8b84e80b1f15f0a602c0665d1f7bf92723efcac2a090b488ccd81c61d5505d3531ad5324fb2ccd07a73dc72a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-nano:az) \
locale(plasma5-nano:bg) \
locale(plasma5-nano:ca) \
locale(plasma5-nano:ca@valencia) \
locale(plasma5-nano:cs) \
locale(plasma5-nano:da) \
locale(plasma5-nano:de) \
locale(plasma5-nano:el) \
locale(plasma5-nano:en_GB) \
locale(plasma5-nano:es) \
locale(plasma5-nano:et) \
locale(plasma5-nano:eu) \
locale(plasma5-nano:fi) \
locale(plasma5-nano:fr) \
locale(plasma5-nano:gl) \
locale(plasma5-nano:hi) \
locale(plasma5-nano:hu) \
locale(plasma5-nano:ia) \
locale(plasma5-nano:id) \
locale(plasma5-nano:it) \
locale(plasma5-nano:ja) \
locale(plasma5-nano:ka) \
locale(plasma5-nano:ko) \
locale(plasma5-nano:lt) \
locale(plasma5-nano:nl) \
locale(plasma5-nano:nn) \
locale(plasma5-nano:pl) \
locale(plasma5-nano:pt) \
locale(plasma5-nano:pt_BR) \
locale(plasma5-nano:ro) \
locale(plasma5-nano:ru) \
locale(plasma5-nano:sk) \
locale(plasma5-nano:sl) \
locale(plasma5-nano:sv) \
locale(plasma5-nano:ta) \
locale(plasma5-nano:tr) \
locale(plasma5-nano:uk) \
locale(plasma5-nano:zh_CN) \
locale(plasma5-nano:zh_TW) \
plasma5-nano-lang \
plasma5-nano-lang-all"
RDEPENDS:${PN} += "plasma5-nano"

inherit rpm
