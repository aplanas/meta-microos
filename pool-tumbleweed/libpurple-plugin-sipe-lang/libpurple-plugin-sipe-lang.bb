SUMMARY = "Translations for package libpurple-plugin-sipe"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-sipe' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "libpurple-plugin-sipe-lang-1.25.0-2.10.noarch.rpm"
RPM_HASH = "0143858dcdb60d90cc7fb6728a76f079f5ebb1b1a4b7a885e4419f3c70331d0cb420d2dce6460d4e018c013f06e8ab2d1712599e4a59797ab635dd201589a7c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-sipe-lang \
libpurple-plugin-sipe-lang-all \
locale(libpurple-plugin-sipe:ar) \
locale(libpurple-plugin-sipe:cs) \
locale(libpurple-plugin-sipe:da) \
locale(libpurple-plugin-sipe:de) \
locale(libpurple-plugin-sipe:el) \
locale(libpurple-plugin-sipe:es) \
locale(libpurple-plugin-sipe:fi) \
locale(libpurple-plugin-sipe:fr) \
locale(libpurple-plugin-sipe:fr_CA) \
locale(libpurple-plugin-sipe:hi) \
locale(libpurple-plugin-sipe:hu) \
locale(libpurple-plugin-sipe:it) \
locale(libpurple-plugin-sipe:ja) \
locale(libpurple-plugin-sipe:ko) \
locale(libpurple-plugin-sipe:lt) \
locale(libpurple-plugin-sipe:nb) \
locale(libpurple-plugin-sipe:nl) \
locale(libpurple-plugin-sipe:pl) \
locale(libpurple-plugin-sipe:pt) \
locale(libpurple-plugin-sipe:pt_BR) \
locale(libpurple-plugin-sipe:ro) \
locale(libpurple-plugin-sipe:ru) \
locale(libpurple-plugin-sipe:sv) \
locale(libpurple-plugin-sipe:ta) \
locale(libpurple-plugin-sipe:te) \
locale(libpurple-plugin-sipe:tr) \
locale(libpurple-plugin-sipe:zh_CN) \
locale(libpurple-plugin-sipe:zh_TW)"

RDEPENDS:${PN} += "libpurple-plugin-sipe"

inherit rpm
