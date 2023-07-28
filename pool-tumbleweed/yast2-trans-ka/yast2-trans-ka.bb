SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ka-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "da46b6cea6233e1bc1c9866c24b0dd281ca100698a4bcc5f7bd7f3f5d77abdcc95fc4c30ae7cae66ebe2ecdd444bd90558e45a9e4214df901f4dbb5b8f9abae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
