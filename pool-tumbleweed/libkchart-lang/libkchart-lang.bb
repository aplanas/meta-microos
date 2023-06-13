SUMMARY = "Translations for package libkchart"
DESCRIPTION = "Provides translations for the 'libkchart' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libkchart-lang-2.8.0-1.14.noarch.rpm"
RPM_HASH = "6a197f18691c7cc1d5c49a32852265c698053602ad283e261fc9d7c2c10a5e4fe980bc453e406097d03a27dd49e7f06f8755b5e9fbaab63b251545655b5641fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkchart-lang \
libkchart-lang-all \
locale(libkchart:ar) \
locale(libkchart:ast) \
locale(libkchart:bs) \
locale(libkchart:ca) \
locale(libkchart:ca@valencia) \
locale(libkchart:cs) \
locale(libkchart:de) \
locale(libkchart:el) \
locale(libkchart:en_GB) \
locale(libkchart:es) \
locale(libkchart:et) \
locale(libkchart:eu) \
locale(libkchart:fi) \
locale(libkchart:fr) \
locale(libkchart:gl) \
locale(libkchart:it) \
locale(libkchart:ko) \
locale(libkchart:nl) \
locale(libkchart:nn) \
locale(libkchart:pl) \
locale(libkchart:pt) \
locale(libkchart:pt_BR) \
locale(libkchart:ro) \
locale(libkchart:ru) \
locale(libkchart:sk) \
locale(libkchart:sv) \
locale(libkchart:tr) \
locale(libkchart:uk) \
locale(libkchart:zh_CN) \
locale(libkchart:zh_TW)"

RDEPENDS:${PN} += "libkchart"

inherit rpm
