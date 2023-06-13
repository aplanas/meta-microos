SUMMARY = "Translations for package plasma5-thunderbolt"
DESCRIPTION = "Provides translations for the 'plasma5-thunderbolt' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-thunderbolt-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "a562a22ccc2ba1941097ea2ef175c5da2cc77cf9d043bcd7215d25a9c6be240856689fd9b37dad609d13b14862b208d953bab647e761a6d7260023a962d16a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-thunderbolt:ar) \
locale(plasma5-thunderbolt:az) \
locale(plasma5-thunderbolt:bg) \
locale(plasma5-thunderbolt:ca) \
locale(plasma5-thunderbolt:ca@valencia) \
locale(plasma5-thunderbolt:cs) \
locale(plasma5-thunderbolt:da) \
locale(plasma5-thunderbolt:de) \
locale(plasma5-thunderbolt:en_GB) \
locale(plasma5-thunderbolt:es) \
locale(plasma5-thunderbolt:et) \
locale(plasma5-thunderbolt:eu) \
locale(plasma5-thunderbolt:fi) \
locale(plasma5-thunderbolt:fr) \
locale(plasma5-thunderbolt:gl) \
locale(plasma5-thunderbolt:hu) \
locale(plasma5-thunderbolt:ia) \
locale(plasma5-thunderbolt:id) \
locale(plasma5-thunderbolt:it) \
locale(plasma5-thunderbolt:ja) \
locale(plasma5-thunderbolt:ka) \
locale(plasma5-thunderbolt:ko) \
locale(plasma5-thunderbolt:lt) \
locale(plasma5-thunderbolt:ml) \
locale(plasma5-thunderbolt:nl) \
locale(plasma5-thunderbolt:nn) \
locale(plasma5-thunderbolt:pa) \
locale(plasma5-thunderbolt:pl) \
locale(plasma5-thunderbolt:pt) \
locale(plasma5-thunderbolt:pt_BR) \
locale(plasma5-thunderbolt:ro) \
locale(plasma5-thunderbolt:ru) \
locale(plasma5-thunderbolt:sk) \
locale(plasma5-thunderbolt:sl) \
locale(plasma5-thunderbolt:sv) \
locale(plasma5-thunderbolt:tr) \
locale(plasma5-thunderbolt:uk) \
locale(plasma5-thunderbolt:zh_CN) \
locale(plasma5-thunderbolt:zh_TW) \
plasma5-thunderbolt-lang \
plasma5-thunderbolt-lang-all"

RDEPENDS:${PN} += "plasma5-thunderbolt"

inherit rpm
