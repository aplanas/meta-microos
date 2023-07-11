SUMMARY = "Plugin for Pidgin for supporting Telegram messager"
DESCRIPTION = "A Pidgin plugin that adds support for the Telegram messenger. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "pidgin-plugin-telegram-1.4.7-1.12.noarch.rpm"
RPM_HASH = "86316be5960927cafcae6cd4d80e75cea80d63c7db2d1bd292726c4c3d4de33bad510944d156bfed3808c204acbafad348e455f584937b21f485844189f639d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-telegram"

RDEPENDS:${PN} += "libpurple-plugin-telegram"

inherit rpm
