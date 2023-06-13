SUMMARY = "Translations for package libpurple-plugin-telegram"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-telegram' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "libpurple-plugin-telegram-lang-1.4.7-1.11.noarch.rpm"
RPM_HASH = "3855d7886157c9597beeab5d4f76b38aca05a4db835ebe0dddd02dfef51a6f236876cdba8a30d195158b367bec4460c14b839a2db7d63ed6b4a77dd7934d2d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-telegram-lang \
libpurple-plugin-telegram-lang-all \
locale(libpurple-plugin-telegram:bg) \
locale(libpurple-plugin-telegram:cs_CZ) \
locale(libpurple-plugin-telegram:de) \
locale(libpurple-plugin-telegram:es) \
locale(libpurple-plugin-telegram:es_AR) \
locale(libpurple-plugin-telegram:fr) \
locale(libpurple-plugin-telegram:fur) \
locale(libpurple-plugin-telegram:it) \
locale(libpurple-plugin-telegram:nl) \
locale(libpurple-plugin-telegram:nn) \
locale(libpurple-plugin-telegram:pl) \
locale(libpurple-plugin-telegram:pt_BR) \
locale(libpurple-plugin-telegram:ru) \
locale(libpurple-plugin-telegram:sq) \
locale(libpurple-plugin-telegram:uk)"

RDEPENDS:${PN} += "libpurple-plugin-telegram"

inherit rpm
