SUMMARY = "Translations for package libpurple-plugin-telegram"
DESCRIPTION = "Provides translations for the 'libpurple-plugin-telegram' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "libpurple-plugin-telegram-lang-1.4.7-1.12.noarch.rpm"
RPM_HASH = "81af080eec28b70594fa3883851acd459deedb6b45e5de8db30497941d0bbe8f14fdbb01e7873f75a97f1c1bc9cb0dbfc5fa533032589fab5c69b7e4da978ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-plugin-telegram-lang \
libpurple-plugin-telegram-lang-all \
locale-libpurple-plugin-telegram-bg \
locale-libpurple-plugin-telegram-cs-CZ \
locale-libpurple-plugin-telegram-de \
locale-libpurple-plugin-telegram-es \
locale-libpurple-plugin-telegram-es-AR \
locale-libpurple-plugin-telegram-fr \
locale-libpurple-plugin-telegram-fur \
locale-libpurple-plugin-telegram-it \
locale-libpurple-plugin-telegram-nl \
locale-libpurple-plugin-telegram-nn \
locale-libpurple-plugin-telegram-pl \
locale-libpurple-plugin-telegram-pt-BR \
locale-libpurple-plugin-telegram-ru \
locale-libpurple-plugin-telegram-sq \
locale-libpurple-plugin-telegram-uk"

RDEPENDS:${PN} += "libpurple-plugin-telegram"

inherit rpm
