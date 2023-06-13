SUMMARY = "Plugin for Pidgin for supporting Telegram messager"
DESCRIPTION = "A Pidgin plugin that adds support for the Telegram messenger. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "pidgin-plugin-telegram-1.4.7-1.11.noarch.rpm"
RPM_HASH = "81c1a57c0ee20a1e4997ecde89838db37fb8df7a58c6855fc5304b74756f8188ce82a788d3bb2c70051677de637becaecdc1e0c89868af1dbe06f50f66dae826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-telegram"

RDEPENDS:${PN} += "libpurple-plugin-telegram"

inherit rpm
