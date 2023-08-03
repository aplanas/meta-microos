SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-el-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "de6dc1378bf341aa2383cd3277a7991f07394be5c16e6c55d7877375ef74cd02580836e2bbf1001ca369869d5985b061a3e6f3be42eb30f16e322d6d91282446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
