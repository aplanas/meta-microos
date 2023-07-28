SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-sv-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "551f44013d0a0a154d6f175ba935ba4a8205a3577d491e7da9d46d93bb22458f3b12b04d1ad0af29bcb7aacf52a275421502ea9088ccc5f24ce11abb7a385965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
