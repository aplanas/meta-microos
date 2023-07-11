SUMMARY = "Wubi table for fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) input tables for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wubi-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "fa1e1211be48298ef966994101869101b0b238ffdf03b477e0d17da639a6c00d969328f9ee4a44851b780094f0b8bf18b2946ea2cb5a4b11ad6b0cca3f008060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi \
locale-fcitx-table-zh-CN;"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
