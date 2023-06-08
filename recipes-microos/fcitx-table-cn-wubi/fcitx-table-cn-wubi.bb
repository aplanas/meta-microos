SUMMARY = "Wubi table for fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) input tables for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wubi-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "31a3d695a5d4ba994a9d852019b19d31b7543c6ba4410f9b3a80f52cb1c10bddc0ea8b716f98572abe2f9c401d4d0f31a081c3e14464adfd50daf5860f314229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi locale(fcitx-table:zh_CN;)"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
