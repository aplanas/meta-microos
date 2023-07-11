SUMMARY = "Evening Breeze(Wanfeng) table for fcitx"
DESCRIPTION = "Fcitx Evening Breeze (Wan feng) input tables for Simplified Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-table-cn-wanfeng-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "07d5019f1a8262afc6d7195ee08c6fe2e8822e6e531c00861e737051109c2f00a2727565d7250186b986aa29689fd0c54bfed7cecfef4caf99997fee5d36217b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wanfeng"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
