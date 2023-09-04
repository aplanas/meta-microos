SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-el-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "861d7e71548a85c4d19be0f2e2155e2cf4d2a4d0dd5b691a41a4fb3ec6171da75ed514422e0b95538d2c529aee35913cd9d28c049d9aa606d519b28738808c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
