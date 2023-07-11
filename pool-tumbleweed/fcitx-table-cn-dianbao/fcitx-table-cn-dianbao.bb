SUMMARY = "Telegram(Dianbao) table for fcitx"
DESCRIPTION = "Fcitx Telegram (Dian Bao) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-dianbao-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "0cd8f6be708d7b242d9edae13ad245c15e7612fd3c8d7865f98a7e618e1591c0ed43154687518c607e746e406443be7f1a15914239dea3d398b02f0ad5fe6e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-dianbao"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
