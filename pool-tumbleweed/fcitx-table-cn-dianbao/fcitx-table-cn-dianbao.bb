SUMMARY = "Telegram(Dianbao) table for fcitx"
DESCRIPTION = "Fcitx Telegram (Dian Bao) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-dianbao-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "f092b0cff61ad6b59b8e3d9aa5e86c32a17ae95d4d82c37ba36685d5f948faca7e9d3bf8b49216644aa088af9baff61d27c7d34e78295b7468e766e94d53cb6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-dianbao"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
