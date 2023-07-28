SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-he-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "a3c540a68a4b3413c30317710ee3c997f9a0823bb9cebcc769a6315c19c0236e1999fa8b2b56256cba522c1ac0b661e1c5826c68e8aa91ab359056ab82b11af1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
