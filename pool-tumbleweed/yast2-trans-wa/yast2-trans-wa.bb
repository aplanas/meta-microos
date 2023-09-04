SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-wa-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "cf45d0bdba8e8af16574754c2094e0d30db848022f0bb56acaeebd6547a850c330405fdbfa073f5ee400b092cf8a5cd4632cd6386db78008f7ffc72d331363e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
