SUMMARY = "Simplified Chinese Tsang-Jei(Cangjie) table for fcitx"
DESCRIPTION = "Fcitx Tsang Jei (Cang Jie) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-cangjie-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "176833d59771c543c3645baf818074357304d1c687e5abadf7acdf56c5ddd4a314b4ad73026d31dc053bbd12902203652591cf9cc2c4786261849f5fb17280d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cangjie"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
