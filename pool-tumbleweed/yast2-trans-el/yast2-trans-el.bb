SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-el-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "2e2049815562a6ae2552a7ee02427d778603110b737fb6eebfd7acdc2d3b15b7443d38302d475d16c73eec9fbf2382c7e6869d47dfc47fd6d7d3aef11aa50ac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
