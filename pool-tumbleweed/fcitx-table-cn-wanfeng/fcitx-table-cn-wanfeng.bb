SUMMARY = "Evening Breeze(Wanfeng) table for fcitx"
DESCRIPTION = "Fcitx Evening Breeze (Wan feng) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wanfeng-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "c521bba7c8bd6e2d4d0d41da92aa1b911d6c47ab2f9af1b514ca759f65a81f28af8603e0b5692816a5d5eee215bd0c36a5b56a9496d9f8a1d0f48140bceef5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wanfeng"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
