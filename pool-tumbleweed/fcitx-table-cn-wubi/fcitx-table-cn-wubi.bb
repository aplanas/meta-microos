SUMMARY = "Wubi table for fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) input tables for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wubi-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "65b4d1be57e9e97297b7d20eaf56bf94b87b13a4f1fcec5d389861c5479a15744c6c7a6b832f4005699221004a76291b860e67cb68563d5ba0980dc808c7d0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi \
locale-fcitx-table-zh-CN;"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
