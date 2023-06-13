SUMMARY = "Simplified Chinese Tsang-Jei(Cangjie) table for fcitx"
DESCRIPTION = "Fcitx Tsang Jei (Cang Jie) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-cangjie-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "08d0ba67b913fa248aa6b4f06b99773c39b23f17a08a0f44927eb51063c562f8d35bb8c957d928b2150a6d05afb148aa9303fbf69d1a0af9fabdac67a5091ea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-cangjie"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
