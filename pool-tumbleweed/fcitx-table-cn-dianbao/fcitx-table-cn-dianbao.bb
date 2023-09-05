SUMMARY = "Telegram(Dianbao) table for fcitx"
DESCRIPTION = "Fcitx Telegram (Dian Bao) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-dianbao-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "ab635c31113996a2708207b817f96d03b5b412261ff5c2a51d024f8eaeaa692a886a8b96d4ff948e04b58002a9bb5d143a79eff04f104dc04070ea2b18671455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-dianbao"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
